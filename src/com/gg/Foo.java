package com.gg;

public class Foo {
//    static {
//        System.out.println("Message");
//        System.exit(0);
//    }

    public static void main(String[] args) {
        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}