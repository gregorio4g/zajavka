package com.gg.test10;

public class CrazyHorse extends CrazyAnimal {
    private String name;

    public CrazyHorse(String name) {
        super(name);
        System.out.print("CrazyHorse");
    }

    public static void main(String[] args) {
        new CrazyAnimal("Crazy Horse is really crazy!");
    }
}
