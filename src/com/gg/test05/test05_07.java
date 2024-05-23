package com.gg.test05;

public class test05_07 {
    public static void main(String[] args) {
        String a = "abc";
        a.concat(String.valueOf(2));
        a = a + 3;
        a = a + true;
        System.out.println(a.length());
    }
}
