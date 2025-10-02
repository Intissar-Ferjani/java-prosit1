import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
//        Prosit 1
//        Instru-1
//        int nbrCages = 20;
//        String zooName = "my zoo";
//        System.out.println(zooName + " comporte " + nbrCages + " cages");

//        Instru-2
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Entrez le nom du zoo : ");
//        String zooName = sc.nextLine();
//
//        int nbrCages;
//        do {
//            System.out.print("Entrer nombre des cages: ");
//            nbrCages = sc.nextInt();
//        } while (nbrCages <= 0);
//
//        System.out.println(zooName + " comporte " + nbrCages + " cages");

//        Prosit 2
        Animal lion = new Animal();
        lion.family = "Felide";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;
//
//        Zoo myZoo = new Zoo();
//        myZoo.name = "Parc";
//        myZoo.city = "tunis";
//        myZoo.nbrCages = 20;
//
//        System.out.println("Zoo : " + myZoo.name + " à " + myZoo.city);
//        System.out.println("Animal : " + lion.name + " (" + lion.family + ")");
//
//        Animal lion1 = new Animal("Felide", "Lion", 5, true);
//        Zoo myZoo1 = new Zoo("Parc", "Tunis", 20);
//
//        System.out.println("Animal créé : " + lion1.name);
//        System.out.println("Zoo créé : " + myZoo1.name + " (" + myZoo.city + ")");
//
//        myZoo.displayZoo();
//        System.out.println(myZoo);

//        Prosit 3
        Zoo zoo1 = new Zoo("Zoo 1", "Tunis");
        Zoo zoo2 = new Zoo("Zoo 2", "Bizerte");

        Animal tigre = new Animal("Felide", "Tiger", 7, true);
        Animal lion2 = new Animal("Felide", "Lion", 5, true);

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(lion2);

        zoo1.displayAnimals();

        System.out.println("Indice : " + zoo1.searchAnimal(lion));
        System.out.println("Indice : " + zoo1.searchAnimal(tigre));

        zoo1.removeAnimal(tigre);
        zoo1.displayAnimals();

        for (int i = 0; i < 30; i++) {
            zoo1.addAnimal(new Animal("TestFamily", "Animal" + i, 2, false));
        }
        System.out.println("Zoo plein " + zoo1.isZooFull());

        zoo2.addAnimal(new Animal("Canidés", "Wolf", 4, true));
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Zoo avec le plus d'animaux : " + plusGrand);
    }
}