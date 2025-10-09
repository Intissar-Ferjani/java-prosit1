package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String hab) {
        super(family, name, age, isMammal);
        this.habitat = hab;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

}
