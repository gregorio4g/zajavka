package com.gg.test11;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal3 animal = Animal3.FISH;
//        System.out.print(animal.canSwim);
        System.out.print(animal.canSwim());

        Animal3 cat = Animal3.CAT;
        System.out.print(cat.canSwim());
        cat.learnToSwim();
        System.out.print(cat.canSwim());
    }
}
