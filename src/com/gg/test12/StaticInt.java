package com.gg.test12;

public class StaticInt {
    static String value = "a";
    {
        value += "b";
    }
    static {
        value += "c";
    }

    {
        value += "d";
    }

    public static void main(String[] args) {
        System.out.print(StaticInt.value);
        System.out.print(StaticInt.value);
        new StaticInt();
        new StaticInt();
        System.out.print(StaticInt.value);
    }
}
