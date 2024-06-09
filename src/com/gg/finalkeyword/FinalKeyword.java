package com.gg.finalkeyword;

public class FinalKeyword {
    public static void main(String[] args) {
        final Car car = new Car("red");
        System.out.println("car = " + car);
        car.setColor("blue");
        System.out.println("car = " + car);
        describe(car);
        System.out.println("car = " + car);
    }

    private static void describe(final Car car) {
        car.setColor("green");
    }
}
