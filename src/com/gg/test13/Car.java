package com.gg.test13;

public class Car {
  public void drive() {
    System.out.print("one");
  }
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
}
