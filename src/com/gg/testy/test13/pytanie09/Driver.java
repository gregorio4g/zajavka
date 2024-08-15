package com.gg.testy.test13.pytanie09;

public class Driver {
    public static void main(String[] args) {
        new Driver().startDriving();
    }

    public void startDriving() {
        System.out.println("one");
        try {
            stopDriving();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("two");
        } finally {
            System.out.println("three");
        }
        System.out.println("four");
    }

    private void stopDriving() {
        System.out.println("five");
        throw new RuntimeException("Throwing exception");
//        System.out.println("six"); // odkomentować trzeba
    }


}
