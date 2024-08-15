package com.gg.testy.test11;

public enum Animal3 {
    DOG(true),
    CAT(false),
    BIRD(false),
    FISH(true);

    private boolean canSwim;

    Animal3(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean canSwim(){
        return canSwim;
    }

    public void learnToSwim(){
        this.canSwim = true;
    }
}


