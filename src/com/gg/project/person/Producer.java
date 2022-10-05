package com.gg.project.person;

import com.gg.project.product.Chocolate;
import com.gg.project.product.Food;
import com.gg.project.product.Sandwich;
import com.gg.project.product.Soup;

public class Producer extends Person implements ProducingMan {

  public Producer(String name, String surname) {
    super(name, surname);
  }

  @Override
  public void consume(Food food) {
      System.out.println("Producer consuming food: " + food);
  }

  @Override
  public String getExpectations() {
    return "No expectations";
  }

  @Override
  public Food produce(String productName, ConsumingMan consumingMan) {
    switch (productName) {
        case "chocolate":
            return new Chocolate(productName, this, consumingMan);
        case "soup":
            return new Soup(productName, this, consumingMan);
        default:
            return new Sandwich(productName, this, consumingMan);
    }
  }
}
