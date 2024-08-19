package com.gg.testy.test14;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nPytanie 14 04");
        quiz04();

        System.out.println("\nPytanie 14 06");
        quiz06();

        System.out.println("\nPytanie 14 07");
        quiz07();

        System.out.println("\nPytanie 14 09");
//        quiz09(); // NullPointerException

        System.out.println("\nPytanie 14 12");
        Set<Exception> set1 = new HashSet<Exception>(); // A
//        List<Object> set2 = new HashSet<Object>();      // B
        List<String> vector1 = new Vector<String>();    // C
//        List<String> list1 = new HashMap<>();           // D
        Collection<Integer> collection = new LinkedList<>();    // E
//        List<int> list2 = new ArrayList<>();            // F

        System.out.println("\nPytanie 14 14");
        quiz14();

        System.out.println("\n\nPytanie 14 15");
        quiz15();

        System.out.println("\nPytanie 14 17");
        quiz17();

    }

    private static void quiz17() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(null);
        set.add(2);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }

    private static void quiz01() {
        List<String> list = new ArrayList<>();
        list.size();
    }

    private static void quiz03() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
//		list.add(3);
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void quiz04() {
        List<Integer> list = Arrays.asList(1, 2, -3, -5);
        Collections.sort(list);
        Integer[] array = list.toArray(new Integer[5]);
        System.out.println(Arrays.toString(array));
    }

    private static void quiz06() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.remove(0);
        list.set(0, 3);
        for (Integer element : list) {
            System.out.println(element);
        }
    }

    private static void quiz07() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer x : list) {
            System.out.print(x);
            return;
        }
    }

    private static void quiz08() {
        List<Integer> list = new ArrayList<>(); // cannot be primitive int
        list.add(1);
        list.add(2);
        list.add(3);
        for (int x : list) {
            System.out.print(x);
            return;
        }
    }

    private static void quiz09() {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt("1"));
        list.add(2);
        list.add(null);
        list.add(Integer.parseInt("3"));
        list.add(Integer.parseInt("4"));
        list.add(5);
        for (int element : list) {
            System.out.print(element);
        }
    }

    private static void quiz14() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put(i,++i);
        }
        System.out.print(map.get(3));
        System.out.print(map.get(4));
    }

    private static void quiz15() {
        Map map = new HashMap();
        map.put("a", 1);
        map.put(1, 'a');
        System.out.println(map.containsKey("1"));
    }
}