package com.gg.test9;

public class Horse {
    String name;
    public Horse(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(new Horse("Robert").name);
    }
}
