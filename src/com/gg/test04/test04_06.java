package com.gg.test04;

public class test04_06 {
    public static void main(String[] args) {
        boolean a = true, b = true, c = false;
        int d = 1;
        c = (d != 20) ^ (b = false) | !c;
        System.out.println(a + ", " + b + ", " + c);
    }
}
