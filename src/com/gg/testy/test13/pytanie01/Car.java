package com.gg.testy.test13.pytanie01;

public class Car {
    public static void driveAgain() {
        System.out.print("two");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        Car anotherCar = null;
        anotherCar.driveAgain();
        anotherCar.drive();
    }

    public void drive() {
        System.out.print("one");
    }
}
