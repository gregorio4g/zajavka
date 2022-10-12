package com.gg.zad11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    exc01();
  }

  private static void exc01() {
    Set<String> stringSet = new HashSet<>();
    stringSet.add("Ala");
    stringSet.add("ma");
    stringSet.add("kota");
    stringSet.add("!");
    stringSet.add("Kot");
    stringSet.add("Alę");
    stringSet.add("?");
    Iterator<String> iterator = stringSet.iterator();
    while(iterator.hasNext()){
      System.out.print(iterator.next());
      if(iterator.hasNext()) {
        System.out.print(", ");
      }
    }
  }
}
