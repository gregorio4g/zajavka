package com.gg.staticexamples;

public class Dog extends Animal27 {

    public static int howManyDogsWeHaveInOurProgram = 0;

    private final String name;

    public Dog(String name) {
        this.name = name;
        howManyDogsWeHaveInOurProgram++;
    }

    public static void staticExampleDog() {
        System.out.println("Dog Static Example");
    }
}
