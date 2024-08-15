package com.gg.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        System.out.println("HashSet");
        Set<String> set1 = new HashSet<>();
        set1.add("Gdańsk");
        set1.add("Warszawa");
        set1.add("Szczecin");
        set1.add("Szczecin");
        set1.add("Wrosław");
        System.out.println("set = " + set1);

        System.out.println("set.size() = " + set1.size());

        Set<String> set2 = new HashSet<>();
        set2.add("Łódź");
        set2.add("Warszawa");
        set2.add("Białystok");
        set2.add("Szczecin");
        set2.add("Wrosław");
        System.out.println("set = " + set2);
    }
}
