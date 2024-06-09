package com.gg.initblocks;

public class Car {
    {
        this.productionYear = "2020";
        printDuringInitBlock();
    }

    private final String productionYear;

    public Car() {
        System.out.println("Constructor called." + Car.class);
    }

    private void printDuringInitBlock() {
        System.out.println("I'm printing during init block in " + Car.class);
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear='" + productionYear + '\'' +
                '}';
    }
}
