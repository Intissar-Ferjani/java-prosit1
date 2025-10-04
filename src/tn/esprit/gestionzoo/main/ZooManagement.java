package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

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
//        lion.family = "Felide";
//        lion.name = "Lion";
//        lion.age = 5;
//        lion.isMammal = true;

//        Prosit 4
        lion.setFamily("Felide");
        lion.setName("Lion");
        lion.setAge(5);
        lion.setMammal(true);

//        tn.esprit.gestionzoo.entities.Zoo myZoo = new tn.esprit.gestionzoo.entities.Zoo();
//        myZoo.name = "Parc";
//        myZoo.city = "tunis";
//        myZoo.nbrCages = 20;
//
//        System.out.println("tn.esprit.gestionzoo.entities.Zoo : " + myZoo.name + " à " + myZoo.city);
//        System.out.println("tn.esprit.gestionzoo.entities.Animal : " + lion.name + " (" + lion.family + ")");
//
//        tn.esprit.gestionzoo.entities.Animal lion1 = new tn.esprit.gestionzoo.entities.Animal("Felide", "Lion", 5, true);
//        tn.esprit.gestionzoo.entities.Zoo myZoo1 = new tn.esprit.gestionzoo.entities.Zoo("Parc", "Tunis", 20);
//
//        System.out.println("tn.esprit.gestionzoo.entities.Animal créé : " + lion1.name);
//        System.out.println("tn.esprit.gestionzoo.entities.Zoo créé : " + myZoo1.name + " (" + myZoo.city + ")");
//
//        myZoo.displayZoo();
//        System.out.println(myZoo);

//        Prosit 3
        Zoo zoo1 = new Zoo("tn.esprit.gestionzoo.entities.Zoo 1", "Tunis");
        Zoo zoo2 = new Zoo("tn.esprit.gestionzoo.entities.Zoo 2", "Bizerte");

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
            zoo1.addAnimal(new Animal("TestFamily", "tn.esprit.gestionzoo.entities.Animal" + i, 2, false));
        }
        System.out.println("tn.esprit.gestionzoo.entities.Zoo plein " + zoo1.isZooFull());

        zoo2.addAnimal(new Animal("Canidés", "Wolf", 4, true));
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo avec le plus d'animaux : " + plusGrand);
    }
}