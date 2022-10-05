package com.gg.project.product;

import com.gg.project.person.ConsumingMan;
import com.gg.project.person.ProducingMan;

public class Chocolate extends Food {
  public Chocolate(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
    super(name, producingMan, consumingMan);
  }
}
