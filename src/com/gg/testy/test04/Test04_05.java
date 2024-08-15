package com.gg.testy.test04;

public class Test04_05 {
    public static void main(String[] args) {
        int i = 5;
        boolean j = i++ < 6;
        boolean k = ++i < 6;
        System.out.println("j = " + j + ", k = " + k);
    }
}
