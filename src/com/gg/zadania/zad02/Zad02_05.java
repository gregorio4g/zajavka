package com.gg.zadania.zad02;

public class Zad02_05 {
    public static void main(String[] args) {
        String sentence = "Ala ma kota i jaVa!";
        String wordToFind = "Java";
        if (sentence.toLowerCase().contains(wordToFind.toLowerCase())) {
            System.out.printf("Zdanie{%s} zawiera słowo {%s}.", sentence, wordToFind);
        }
    }
}
