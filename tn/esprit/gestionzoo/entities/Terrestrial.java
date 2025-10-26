package tn.esprit.gestionzoo.entities;

public class Terrestrial {
    protected int nbrLegs;

    public Terrestrial(int nbrLegs){
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString(){
        return "nbrLegs = "+nbrLegs;
    }
}
