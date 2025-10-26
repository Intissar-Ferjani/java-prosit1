package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args){
//        int nbrCages;
//        String zooName;
//
//        Scanner sc = new Scanner(System.in);
//
//        do {
//            System.out.println("Entrer nom du zoo : ");
//            zooName = sc.nextLine();
//        } while(zooName.isEmpty());
//
//        do {
//            System.out.println("Entrer le nombre des cages : ");
//            nbrCages = sc.nextInt();
//        } while(nbrCages<=0);
//
//        System.out.println(zooName+" comporte "+nbrCages+" cages");

        Animal a = new Animal("lions", "l1", 5, true);
        Zoo z = new Zoo("zoo1", "colombia", 10);

        Animal a2 = new Animal("lions", "l2", 15, true);
//        System.out.println(z.toString());
//        System.out.println(a2.toString());

        Animal a3 = new Animal("lions", "l3", 15, true);
        Animal a4 = new Animal("lions", "l3", 15, true);
        z.addAnimal(a);
        z.addAnimal(a2);
        z.addAnimal(a3);
//        z.addAnimal(a4);
//        z.afficherAnimals();
//        System.out.println(z.searchAnimal(a3));
//        System.out.println("\nAVANT SUPPRESSION--------\n");
//        z.afficherAnimals();
//        System.out.println("\nAPRES SUPPRESSION--------\n");
//        System.out.println(z.removeAnimal(a3));
//        z.afficherAnimals();
//        System.out.println("tn.esprit.gestionzoo.entities.Zoo plein ?");
//        System.out.println(z.isZooFull());
//        System.out.println("tn.esprit.gestionzoo.entities.Zoo plus grand");
//        Zoo z2 = new Zoo("zoo2", "colombia", 10);
//        System.out.println(Zoo.comparer(z,z2));

//        Aquatic aq = new Aquatic("mer");
        Terrestrial tr = new Terrestrial(4);
        Dolphin dph = new Dolphin("dolphins", "dph", 15, true, "mer", 7.2f);
        Penguin pg = new Penguin("peguins", "pg", 15, true, "bassin", 8.4f);

        System.out.println("-------- Aquatic\n");
//        System.out.println(aq.toString());
//        aq.swim();
        System.out.println("-------- terrestial\n");
        System.out.println(tr.toString());
        System.out.println("-------- dolphin\n");
        System.out.println(dph.toString());
        dph.swim();
        System.out.println("-------- penguin\n");
        System.out.println(pg.toString());
        pg.swim();

        //--------------------------
//        Aquatic aq1 = new Aquatic("mer1");
        Dolphin dph1 = new Dolphin("dolphins", "dph1", 15, true, "mer", 8.2f);
//        z.addAquaticAnimal(aq1);
        z.addAquaticAnimal(dph1);
        System.out.println("--------------- swim all");
//        z.swimAll();

        //----------------------
        Penguin pg2 = new Penguin("peguins", "pg", 15, true, "bassin", 9.4f);
        z.addAquaticAnimal(pg);
        z.addAquaticAnimal(pg2);
        System.out.println("--------\nLa profondeur maximale de vos pingouins dans votre zoo");
        System.out.println(z.maxPenguinSwimmingDepth());
        //----------------------
        System.out.println("-------------\n");
        z.displayNumberOfAquaticsByTypr();

        //--------------
        System.out.println("\ntest equals");
        System.out.println(pg.equals(pg2));
    }
}
