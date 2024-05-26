package com.gg.zad02;

public class Zad02_03 {
    public static void main(String[] args) {
        String inputString = "Ala ma kota i psa";
        System.out.println(inputString);
        double replacement = 3.14;
        System.out.println(inputString.replaceAll("[aąeęiouyAĄEĘIOUY]", String.valueOf(replacement)));
    }
}
