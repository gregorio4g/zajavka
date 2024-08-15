package com.gg.zadania.zad02;

public class Zad02_04 {
    public static void main(String[] args) {
        String sentence = "Ala ma kota i Java!";
        String wordToFind = "Java";
        if (sentence.contains(wordToFind)) {
            System.out.printf("Zdanie{%s} zawiera słowo {%s}.", sentence, wordToFind);
        }
    }
}
