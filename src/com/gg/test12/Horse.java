package com.gg.test12;

public interface Horse {
    int height = 120;

    public static void fly() {
        System.out.println("Flying");
    }

    default void eat() {
        System.out.println("Eating");
    }

    default void horn() {
        System.out.println("Horning");
    }

    ;
}
