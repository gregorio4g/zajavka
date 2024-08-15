package com.gg.testy.test06;

public class Test06_02 {
    public static void main(String[] args) {
        int result = 0;
        int i = 0, j = 10;
        while (i<j) {
            ++j;
            i += 3;
            result += j - 2;
        }
        System.out.println(result);
    }
}
