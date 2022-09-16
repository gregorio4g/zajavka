package com.gg.pack8.initblocks;

public class Car {
    {
        this.productionYear = "2020";
        printDuringInitBlock();
    }

    private String productionYear;

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
