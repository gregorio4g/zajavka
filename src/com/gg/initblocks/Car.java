package com.gg.initblocks;

public class Car {
    static String staticField;

    static {
        staticField = "staticField Car";
        System.out.println("Car static initBlock");
    }

    private final String nonStaticField1;
    private final String productionYear;
    private final String nonStaticField3 = initField3A();

    {
        productionYear = "2020";
        printDuringInitBlock();
        staticField = "staticField Car";
    }

    public Car(String nonStaticField1) {
        this.nonStaticField1 = nonStaticField1;
        System.out.println("Constructor called." + Car.class);
    }

    private String initField3A() {
        System.out.println("Car initField3A method");
        return "initField3 Car";
    }

    private void printDuringInitBlock() {
        System.out.println("I'm printing during init block in " + Car.class);
    }

    @Override
    public String toString() {
        return "Car{" +
                "nonStaticField1='" + nonStaticField1 + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", nonStaticField3='" + nonStaticField3 + '\'' +
                '}';
    }
}

