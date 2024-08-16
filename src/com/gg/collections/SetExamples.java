package com.gg.collections;

import com.gg.testy.test13.pytanie05_06.HasNext;

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
        set1.add("Wrocław");
        System.out.println("set = " + set1);

        System.out.println("set.size() = " + set1.size());

        Set<String> set2 = new HashSet<>();
        set2.add("Łódź");
        set2.add("Warszawa");
        set2.add("Białystok");
        set2.add("Szczecin");
        set2.add("Wrocław");
        System.out.println("set = " + set2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union = " + union);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection = " + intersection);

        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("difference = " + difference);

        System.out.println();

        Set<Car> cars = new HashSet<>();
        Car car1 = new Car("BMW", "X1", 2020);
        Car car2 = new Car("BMW", "X1", 2020);
        Car car3 = new Car("BMW", "X1", 2020);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println("cars = " + cars);

    }
}
