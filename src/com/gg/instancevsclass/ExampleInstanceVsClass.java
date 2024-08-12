package com.gg.instancevsclass;

public class ExampleInstanceVsClass {
    public static void main(String[] args) {
        Car29 car29_1 = new Car29();
        System.out.println("Car29.statiNumberOfCarsCreated = " + Car29.statiNumberOfCarsCreated);
        Car29 car29_2 = new Car29();
        System.out.println("Car29.statiNumberOfCarsCreated = " + Car29.statiNumberOfCarsCreated);
        Car29 car29_3 = new Car29();
        System.out.println("Car29.statiNumberOfCarsCreated = " + Car29.statiNumberOfCarsCreated);
        Car29 car29_4 = new Car29();
        System.out.println("Car29.statiNumberOfCarsCreated = " + Car29.statiNumberOfCarsCreated);
        Car29 car29_5 = new Car29();
        System.out.println();
        System.out.println("Car29.statiNumberOfCarsCreated = " + Car29.statiNumberOfCarsCreated);
        System.out.println("car29_1.numberOfCarsCreated = " + car29_1.numberOfCarsCreated);
        System.out.println("car29_2.numberOfCarsCreated = " + car29_2.numberOfCarsCreated);
        System.out.println("car29_3.numberOfCarsCreated = " + car29_3.numberOfCarsCreated);
        System.out.println("car29_4.numberOfCarsCreated = " + car29_4.numberOfCarsCreated);
        System.out.println("car29_5.numberOfCarsCreated = " + car29_5.numberOfCarsCreated);
    }
}
