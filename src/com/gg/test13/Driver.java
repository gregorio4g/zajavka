package com.gg.test13;

public class Driver {
  public void startDriving() {
    System.out.println("one");
    try {
      stopDriving();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("two");
    } finally {
      System.out.println("three");
    }
    System.out.println("four");
  }

  private void stopDriving() {
    System.out.println("five");
    throw new RuntimeException("Throwing exception");
  }

  public static void main(String[] args) {
    new Driver().startDriving();
  }

  private static void quizMethod() {
    String a = null;
    try {
      a.toLowerCase();
    } catch (RuntimeException e) {
      System.out.println(0);
    } finally {
      System.out.println(2);
    }
  }
}
