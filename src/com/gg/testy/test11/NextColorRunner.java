package com.gg.testy.test11;

public class NextColorRunner {
    public static void main(String[] args) {
        Color c = Color.GREEN;
        switch (c.ordinal()) { // switch (c) {
            case 0:
                System.out.println(Color.values()[0]);
            case 1:
                System.out.println(Color.values()[1]);
            case 2:
                System.out.println(Color.values()[2]);
                break;
            default:
                System.out.println("NOPE");
        }
    }
}
