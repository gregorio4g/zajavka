package com.gg.project.product;

import com.gg.project.person.ConsumingMan;
import com.gg.project.person.ProducingMan;

public class Soup extends Food {
  public Soup(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
    super(name, producingMan, consumingMan);
  }
}
