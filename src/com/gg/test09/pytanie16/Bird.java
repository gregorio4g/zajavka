package com.gg.test09.pytanie16;

public abstract class Bird {
    private void fly() {
        System.out.println("Bird is birding");
    }

    public static void main(String[] args) {
        Bird bird = new Duck();
        bird.fly();
    }
}
