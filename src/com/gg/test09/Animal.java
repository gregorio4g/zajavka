package com.gg.test09;

public class Animal {
    private String name;

    public Animal() {
        this.name = "KOŃ RAFAŁ";
    }

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.name);
    }
}
