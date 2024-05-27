package com.gg.zad02;

public class Zad02_07 {
    public static void main(String[] args) {
        String sentence = "soifduhoasdiuhf78y89ergf jhbd98f7sbdfkjbfk";
        if (sentence.length() > 10) {
            System.out.println(sentence.substring(3, 8));
        } else {
            System.out.println("Zdanie jest za krótkie!");
        }
    }
}
