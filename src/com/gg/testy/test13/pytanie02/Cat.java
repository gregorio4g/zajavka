package com.gg.testy.test13.pytanie02;

public class Cat extends Animal {
  public static void print() throws RuntimeException { // static added
    System.out.println("Cat");
  }

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.print();
  }
}
