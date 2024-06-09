package com.gg.initblocks;

public class Cabriolet extends Car {

    {
        this.company = "Audi";
        printDuringInitBlock();
    }

    private String company = "Mercedes";
    private final String model;


    public Cabriolet(String model) {
        System.out.println("Constructor called: " + Cabriolet.class);
        this.model = model;
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
