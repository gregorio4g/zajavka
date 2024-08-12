package com.gg.initblocks;

public class Cabriolet extends Car {

    static String staticFieldClassCabriolet;

    static {
        staticFieldClassCabriolet = "static Field Cabriolet";
        System.out.println("Cabriolet static initBlock");
    }

    private final String model;
    private final String nonStaticField3B = initField3B();
    private String company = "Mercedes";

    {
        this.company = "Audi";
        printDuringInitBlock();
    }


    public Cabriolet(String model) {
        super("from Cabriolet");
        System.out.println("Constructor called: " + Cabriolet.class);
        this.model = model;
    }

    private String initField3B() {
        System.out.println("Cabriolet initField3B method");
        return "initField3 Cbriolet";
    }

    private void printDuringInitBlock() {
        System.out.println("I'm printing during init block in " + Cabriolet.class);
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                "} " + super.toString();
    }

}
