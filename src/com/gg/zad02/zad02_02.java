package com.gg.zad02;

import java.util.Arrays;

public class zad02_02 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        String s2 = "";
        if(args.length == 5) {
            for (String arg : args) {
                s1.append(arg).append(" ");
                s2 = s2.concat(arg).concat(" ");
            }
            System.out.println(s1);
            System.out.println(s2);
        } else {
            System.out.println("No args!");
        }
        System.out.println(Math.PI);
    }
}
