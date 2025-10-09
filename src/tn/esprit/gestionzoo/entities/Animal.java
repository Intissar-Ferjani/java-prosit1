package tn.esprit.gestionzoo.entities;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(){}

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal [Famille=" + family + ", Nom=" + name + ", Âge=" + age + ", Mammifère=" + isMammal + "]";
    }

//    Prosit 4


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 ){
            this.age = age;
        }
        else
            System.out.println("Un animal ne peut pas avoir un âge négatif");

    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getMammal(){
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}