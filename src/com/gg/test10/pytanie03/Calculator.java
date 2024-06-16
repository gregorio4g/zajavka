package com.gg.test10.pytanie03;

public class Calculator {
    public static double calculate(int x) {
        x = -1;
        return x * 2.0;
    }

    public static void main(String[] args) {
        int value = 10;
        System.out.println(calculate(value) + ", " + value);
    }
}
