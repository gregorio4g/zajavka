package com.gg.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        System.out.println("duplikaty, zachowuje kolejność");
        List<String> citiesList = new ArrayList<>();
        citiesList.add("Warsaw");
        citiesList.add("Łódź");
        citiesList.add("Zielona Góra");
        citiesList.add(1,"Gdynia");
        System.out.println(citiesList);
        System.out.println("citiesList.getFirst() = " + citiesList.getFirst());
        System.out.println(citiesList.removeFirst());
        System.out.println("citiesList = " + citiesList);

        String[] array = citiesList.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        ///////////////////////////
        System.out.println();
        System.out.println("LinkedList");
        List<String> stringList = new LinkedList<>();
        stringList.add("Olsztyn");
        System.out.println(stringList);
        stringList.addFirst("Wąchock");
        stringList.addLast("Lądek Zdrój");
        System.out.println("stringList = " + stringList);
    }
}
