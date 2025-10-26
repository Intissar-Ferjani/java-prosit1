package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString(){
        return "habitat : "+habitat;
    }

    public abstract void swim();//    {
//        System.out.println("This aquatic animal is swimming");
//    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if( obj == null || getClass() != obj.getClass())
            return false;
        Aquatic a = (Aquatic) obj;
        return this.getName().equals(a.getName()) && this.getAge() == a.getAge() && this.habitat.equals(a.habitat);
    }
}
