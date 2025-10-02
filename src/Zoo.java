public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    static int i =0;

    public Zoo(){}

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Zoo : " + name + ", Ville : " + city + ", Cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + nbrCages + "]";
    }
}