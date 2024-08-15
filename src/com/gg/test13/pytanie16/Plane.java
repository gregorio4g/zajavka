package com.gg.test13.pytanie16;

public class Plane {
  public static void main(String[] args) {
    Plane plane = new Plane();
    plane.countWheels();
    System.out.println(5);
  }
  private String numberOfWheels;
  public long longNumberOfWheels;

  private void countWheels() {
    System.out.println(1);
    try {
      System.out.println(2);
      longNumberOfWheels = Long.parseLong(numberOfWheels);
      System.out.println(3);
    } catch (NullPointerException e) {
      System.out.println(4);
      throw e;
    }
  }
}
