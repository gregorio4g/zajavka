package com.gg.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {


        Map<Integer, String> people = new HashMap<>();
        people.put(2, "Ala Makota");
        people.put(-9, "Ala Mapsa");
        people.put(65, "Jurek Jejajko");
        System.out.println(people);
    }
}
