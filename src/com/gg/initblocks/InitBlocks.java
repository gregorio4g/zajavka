package com.gg.initblocks;

public class InitBlocks {
    public static void main(String[] args) {
        System.out.println("Car.staticField = " + Car.staticField);
        System.out.println("Cabriolet.staticField = " + Cabriolet.staticField);
        System.out.println("Cabriolet.staticFieldClassCabriolet = " + Cabriolet.staticFieldClassCabriolet);
        Cabriolet cabriolet1 = new Cabriolet("A4");
        System.out.println(cabriolet1);
        Cabriolet cabriolet2 = new Cabriolet("A6");
        System.out.println(cabriolet2);
    }
}
