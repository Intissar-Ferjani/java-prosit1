package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.age = age;
        this.isMammal = isMammal;
        this.name = name;
    }

    @Override
    public String toString(){
        return "famille : "+family+"\nnom est "+name+"\nage : "+age+"\nisMammal : "+isMammal;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age > 0) {
            this.age = age;
        }
        else
            System.out.println("Un animal ne peut pas avoir un âge négatif ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(!name.isEmpty()){
            this.name = name;
        }
        else
            System.out.println("Le nom d’un tn.esprit.gestionzoo.entities.Zoo ne doit pas être vide ");
    }

}
