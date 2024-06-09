package com.gg.test09.pytanie08;

public class Animal {
    private String name;

    public Animal() {
        this.name = "KOŃ RAFAŁ"; // A <--
//        new Animal("KOŃ RAFAŁ"); // B
//        Animal("KOŃ RAFAŁ"); // C
//        this("KOŃ RAFAŁ"); //D <--
    }

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.name);
    }
}
