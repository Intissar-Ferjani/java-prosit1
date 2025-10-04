package tn.esprit.gestionzoo.entities;

public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    static int i =0;
    final int NBR_CAGES = 25;
    int animalCount;


    public Zoo(){}

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
    }

//    Prosit 4

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
        else
            System.out.println("Le nom d’un tn.esprit.gestionzoo.entities.Zoo ne doit pas être vide");

    }

    //    ---
    public void displayZoo() {
        System.out.println("tn.esprit.gestionzoo.entities.Zoo : " + name + ", Ville : " + city + ", Cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + nbrCages + "]";
    }

//    public boolean addAnimal(tn.esprit.gestionzoo.entities.Animal animal){
//        if(i<animals.length){
//            animals[i] = animal;
//            i++;
//            return true;
//        }
//        return  false;
//    }
//    Prosit 4
    public boolean addAnimal(Animal animal){
        if(!isZooFull()){
            animals[i] = animal;
            i++;
            return true;
        }
        return  false;
    }
//    ---

    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal non trouvé");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount)
            return z1;
        else if (z2.animalCount > z1.animalCount)
            return z2;
        else {
            return null;
        }
    }
}