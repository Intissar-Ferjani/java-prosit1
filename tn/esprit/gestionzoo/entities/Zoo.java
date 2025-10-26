package tn.esprit.gestionzoo.entities;

public class Zoo {
    private final int NBR_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int countAnimals = 0;
    Aquatic[] aquaticAnimals = new Aquatic[10];
    int countAquatics = 0;

    public Zoo(String name, String city, int nbrCages){
        this.name = name;
        this.city= city;
        this.nbrCages= nbrCages;
        this.animals = new Animal[NBR_CAGES];
    }

    public void displayZoo(){
        System.out.println("nom du zoo est "+name+"\nville : "+city+"\nnombre des cages : "+nbrCages);
    }

    @Override
    public String toString(){
        return "nom du zoo est "+name+"\nville : "+city+"\nnombre des cages : "+nbrCages;
    }

    public boolean addAnimal(Animal animal){
//        if (countAnimals < NBR_CAGES){
            if (!isZooFull()){
                if(searchAnimal(animal) == -1){
                    animals[countAnimals] = animal;
                    countAnimals++;
                    return  true;
                }
        }
        System.out.println("le tableau est plein");
        return false;
    }

    public void afficherAnimals(){
        System.out.println("liste des animaux");
        for(int i=0; i< countAnimals; i++){
            System.out.println(animals[i]);
            System.out.println("\n--------\n");
        }
    }

    public int searchAnimal(Animal animal){
        for (int i=0; i<animals.length; i++){
            if( animals[i] != null && (animals[i]).equals(animal)){
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal){
        int supp =0;
        if(searchAnimal(animal) != -1){
            supp = searchAnimal(animal);
            for (int i =supp; i<countAnimals; i++){
                animals[i] = animals[i+1];
            }
            animals[animals.length-1] = null;
            countAnimals--;
            return true;
        }
        return false;
    }

    public boolean isZooFull(){
        return countAnimals >= NBR_CAGES;
    }

    public static Zoo comparer(Zoo z1, Zoo z2){
        if(z1.countAnimals > z2.countAnimals)
            return z1;
        return z2;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        if(countAquatics < aquaticAnimals.length){
            aquaticAnimals[countAquatics] = aquatic;
            countAquatics++;
            System.out.println("aquatique ajouté");
        }
        else
            System.out.println("tableau des aquatiques est plein");
    }

    public void swimAll(){
        for(int i=0; i<aquaticAnimals.length; i++){
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth(){
        float max_depth =0;
        for(int i=0; i< aquaticAnimals.length; i++){
            if(aquaticAnimals[i] instanceof Penguin){
                if(((Penguin)aquaticAnimals[i]).swimmingDepth > max_depth)
                    max_depth = ((Penguin)aquaticAnimals[i]).swimmingDepth;
            }
        }
        return max_depth;
    }

    public void displayNumberOfAquaticsByTypr(){
        int nbr_dph = 0;
        int nbr_pg = 0;

        for(int i=0; i<aquaticAnimals.length; i++){
            if (aquaticAnimals[i] instanceof Dolphin)
                nbr_dph++;
            if (aquaticAnimals[i] instanceof Penguin)
                nbr_pg++;
        }
        System.out.println("Nombre des dauphins : "+nbr_dph+"\nNombre des pingouins : "+nbr_pg);
    }
}
