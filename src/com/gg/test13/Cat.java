package com.gg.test13;

public class Cat extends Animal {
  public static void print() throws RuntimeException {
    System.out.println("Cat");
  }

  public static void main(String[] args) {
    Cat cat = new Cat();
    print();
  }
}
