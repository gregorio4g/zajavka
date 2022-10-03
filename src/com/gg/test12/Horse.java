package com.gg.test12;

public interface Horse {
    int height = 128;
    default void eat() {
        System.out.println("Eating");
    }
    default void horn() {
        System.out.println("Horning");
    }
    public static void fly() {
        System.out.println("Flying");
    };
}
