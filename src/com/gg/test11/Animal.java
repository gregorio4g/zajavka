package com.gg.test11;

public enum Animal implements CanSwim {
    DOG(true),
    CAT(false),
    BIRD(false),
    FISH(true);
    private boolean canSwim;
    Animal(boolean canSwim) {
        this.canSwim = canSwim;
    }
    public boolean canSwim(){
        return canSwim;
    }
    public void learnToSwim(){
        this.canSwim = true;
    }
}


