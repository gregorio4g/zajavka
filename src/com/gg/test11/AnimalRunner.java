package com.gg.test11;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = Animal.FISH;
//        System.out.print(animal.canSwim);
        System.out.print(animal.canSwim());

        Animal cat = Animal.CAT;
        System.out.print(cat.canSwim());
        cat.learnToSwim();
        System.out.print(cat.canSwim());
    }
}
