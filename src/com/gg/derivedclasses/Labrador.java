package com.gg.derivedclasses;

public class Labrador extends Dog{
    public Labrador() {
        System.out.println("Labrador created.");
    }

    public Labrador(int i) {
        this(String.valueOf(i));
        System.out.println("Labrador created with int: " + i);
    }

    private Labrador(String s) {
        this();
        System.out.println("Labrador created with String: " + s);
    }
}
