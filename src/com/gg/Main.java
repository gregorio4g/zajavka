package com.gg;

public class Main {
    public static void main(String[] args) {
        System.out.println("2. Napisz taki sam program, tylko spraw, żeby na ekranie została wydrukowana treść tego zadania.");
        // exc 2 - zad 1
        String s1 = "Ala ma kota!";
        int i1 = s1.length();
        System.out.println("2-1: " + i1);
        // zad 2
        String a = "Alpha";
        String b = "Bravo";
        String c = "Charlie";
        String d = "Delta";
        String e = "Echo";
        System.out.println(a + b + c + d + e);
        System.out.println(e.concat(d).concat(c).concat(b).concat(a));
        // zad 3
        double d3 = 1.23;
        String s3 = s1.replaceAll("[aąeęioóuyAĄEĘIOÓY]", Double.toString(d3));
        System.out.println(s3);
        // zad 4
        String s4 = "Java  Server Pages";
        System.out.println("s4 " + (s4.contains("Java") ? "contains" : "does not contain") + " Java.");
        // zad 5
        String s51 = "Java";
        String s52 = "jaVa";
        System.out.println(s51+".equals("+s52+") = " + s51.equals(s52));
        System.out.println(s51+".equalsIgnoreCase("+s52+") = " + s51.equalsIgnoreCase(s52));
        // zad 6
        String s6 = "SomeStringLongerThan10Characters";
        System.out.println(s6.substring(3, 3+5));
        ////////////
    }
}
