package com.gg.staticexamples;

public class StaticExamples {
    public static void main(String[] args) {
        System.out.println("Dog.howManyDogsWeHaveInOurProgram = " + Dog.howManyDogsWeHaveInOurProgram);
        Dog dog1 = new Dog("Burek");
        System.out.println("dog1.howManyDogsWeHaveInOurProgram = " + Dog.howManyDogsWeHaveInOurProgram);
        Dog dog2 = new Dog("Azor");
        System.out.println("dog1.howManyDogsWeHaveInOurProgram = " + Dog.howManyDogsWeHaveInOurProgram);
        System.out.println("dog2.howManyDogsWeHaveInOurProgram = " + Dog.howManyDogsWeHaveInOurProgram);
        Dog dog3 = new Dog("Szczekacz");
        System.out.println("dog1.howManyDogsWeHaveInOurProgram = " + Dog.howManyDogsWeHaveInOurProgram);
        System.out.println("dog2.howManyDogsWeHaveInOurProgram = " + Dog.howManyDogsWeHaveInOurProgram);
        System.out.println("dog3.howManyDogsWeHaveInOurProgram = " + Dog.howManyDogsWeHaveInOurProgram);

        staticExample();
        Dog.staticExampleDog();
    }

    private static void staticExample() {
        System.out.println("Static Example");
    }
}
