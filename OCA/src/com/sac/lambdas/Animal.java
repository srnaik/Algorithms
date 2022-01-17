package com.sac.lambdas;

public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    Animal(String species, boolean canHop, boolean canSwim){
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isCanHop() {
        return canHop;
    }

    public boolean isCanSwim() {
        return canSwim;
    }
}
