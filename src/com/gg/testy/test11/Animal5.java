package com.gg.testy.test11;

public enum Animal5 implements CanSwim {
    DOG(true),
    CAT(false),
    BIRD(false),
    FISH(true);
    private final boolean canSwim;
    Animal5(boolean canSwim) {
        this.canSwim = canSwim;
    }
    public boolean canSwim(){
        return canSwim;
    }
}


