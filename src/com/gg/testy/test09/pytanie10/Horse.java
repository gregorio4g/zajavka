package com.gg.testy.test09.pytanie10;

public class Horse {
    String name;
    public Horse(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(new Horse("Robert").name);
    }
}
