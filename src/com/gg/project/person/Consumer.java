package com.gg.project.person;

import com.gg.project.product.Food;

public class Consumer extends Person{
  private final String expectations;
  public Consumer(String name, String surname, String expectations) {
    super(name, surname);
    this.expectations = expectations;
  }

  @Override
  public void consume(Food food) {
    System.out.println("Consumer consuming food: " + food);
  }

  public String getExpectations() {
    return expectations;
  }
}
