package com.gg.collections;

import java.util.*;

public class IteratorExamples {
    public static void main(String[] args) {
        List<String> citiesList = new ArrayList<>();
        citiesList.add("Warszawa");
        citiesList.add("Łódź");
        citiesList.add("Zielona Góra");
        citiesList.add("Gdynia");

        for (String city : citiesList) {
            System.out.println(city);
        }

        System.out.println();
        Iterator<String> iterator = citiesList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        ListIterator<String> stringListIterator = citiesList.listIterator();
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }

        System.out.println();
        while (stringListIterator.hasPrevious()) {
            System.out.println(stringListIterator.previous());
        }

        System.out.println("Set");
        Set<String> citiesSet = new HashSet<>();
        citiesSet.add("Warszawa");
        citiesSet.add("Łódź");
        citiesSet.add("Zielona Góra");
        citiesSet.add("Gdynia");

        for (String city : citiesSet) {
            System.out.println(city);
        }

        System.out.println("\nSet iterator:");
        Iterator<String> iterator1 = citiesSet.iterator();
//        citiesSet.add("ABC"); // ConcurrentModificationException
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("\nMap:");
        Map<String, String> cars = new HashMap<>();
        cars.put("Volvo", "XC60");
        cars.put("Fiat", "Panda");
        cars.put("Volkswagen", "Golf");

        for (Map.Entry<String, String> stringEntry : cars.entrySet()) {
            System.out.println(stringEntry);
        }

        System.out.println("\nMAp iterator:");
        Iterator<Map.Entry<String, String>> iterator2 = cars.entrySet().iterator();
        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("\nArrays to List:");
        Integer[] array = {1, 4, 7, 0, 8};
        List<Integer> list= Arrays.asList(array);
        list.set(0,5);
        System.out.println(Arrays.toString(array));
        array[1] = 6;
        System.out.println(list);

        Integer[] objects = list.toArray(new Integer[0]);
        System.out.println("Arrays.toString(objects) = " + Arrays.toString(objects));
    }
}
