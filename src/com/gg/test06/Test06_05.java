package com.gg.test06;

public class Test06_05 {
    public static void main(String[] args) {
        int result = 0;
        LABEL:
        for (int i = 10; i <= 23 ; i++) {
            for (int j = 1; true ; j++) {
                if(i * j % 3 == 0) {
                    continue LABEL;
                }
                if (i == 14) {
                    break;
                }
                result++;
            }
        }
        System.out.println(result);
    }
}
