package com.gg.test09.pytanie13;

public class Dog implements CanRunFast {
    public boolean isFast() {
        return false;
    }

    public static void main(String[] args) {
        CanRunFast animal = new Dog();
        System.out.println(animal.isFast());
    }
}
