package com.gg.testy.test06;

public class test06_01 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 10; i > 0;) {
            i = i--; // endless; change to --i
            result++;
        }
        System.out.println(result);
    }
}
