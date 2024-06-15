package com.gg.finalkeyword;

public class FinalKeyword {
    public static void main(String[] args) {
        final Car car = new Car("red");
        System.out.println("car1 = " + car);
//        car = new Car("blue"); // niemożliwe, bo car jes final
//        System.out.println("car2 = " + car);
        car.setColor("blue");
        System.out.println("car3 = " + car);
        describe(car);
        System.out.println("car4 = " + car);

        String a = "Hello World!";
        a = a.replace("World", "Grzegorz");
        System.out.println("a = " + a);

        ImmutableVan van = new ImmutableVan(true, "red");
        System.out.println("van = " + van);
        ImmutableVan van2 = van.closeTheRoof();
        System.out.println("van2 = " + van2);

    }

    private static void describe(final Car car) {
        System.out.println("car5 = " + car);
//        car = new Car("yellow"); // car jest final
//        System.out.println("car6 = " + car);
        car.setColor("green");
        System.out.println("car7 = " + car);
    }
}
