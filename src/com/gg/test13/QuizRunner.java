package com.gg.test13;

public class QuizRunner {
  public static void main(String[] args) {
    System.out.println("one");
    try {
      System.out.println("two");
      throw new NullPointerException();
    } catch (NullPointerException e) {
      System.out.println("three");
      throw new RuntimeException("four");
    } catch (RuntimeException e) {
      System.out.println("five");
      throw new RuntimeException("six");
    } finally {
      System.out.println("seven");
      throw new RuntimeException("eight");
    }
  }
}
