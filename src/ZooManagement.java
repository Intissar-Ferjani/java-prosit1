import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
//        Instru-1
//        int nbrCages = 20;
//        String zooName = "my zoo";
//        System.out.println(zooName + " comporte " + nbrCages + " cages");

//        Instru-2
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();

        int nbrCages;
        do {
            System.out.print("Entrer nombre des cages: ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);

        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}