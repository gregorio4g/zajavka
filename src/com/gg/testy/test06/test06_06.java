package com.gg.testy.test06;

public class test06_06 {
    public static void main(String[] args) {
        boolean loopTheLoop = true;
        int i = 0, result = 10;
        do {
            ++i;
            if (i == 8) {
                loopTheLoop = false;
            }
            result -= 2;
        } while (loopTheLoop);
        System.out.println(result);
    }
}
