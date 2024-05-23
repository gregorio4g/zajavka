package com.gg.test05;

public class test05_04 {
    public static void main(String[] args) {
        int a = 12;
        long b = a * 7 - ++a;
        if (b < 10) System.out.println("if");
        else System.out.println("else if");
//        else System.out.println("else");
    }

}
