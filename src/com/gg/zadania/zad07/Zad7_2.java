package com.gg.zadania.zad07;

public class Zad7_2 {
    public static void main(String[] args) {
        Function fh = new HalfCalculator();
        Function fq = new QuarterCalculator();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d %d %d %n", i, fh.calculate(i), fq.calculate(i));
        }

        FunctionClass fch = new HalfCalculator();
        FunctionClass fcq = new QuarterCalculator();
        for (int i = 10; i < 20; i++) {
            System.out.printf("%d %d %d %n", i, fch.calculateC(i), fcq.calculateC(i));
        }

        Function[] fArray = new Function[10];
        for (int i = 0; i < fArray.length; i++) {
            if (i%2 == 0) {
                fArray[i] = new HalfCalculator();
            } else {
                fArray[i] = new QuarterCalculator();
            }
        }

        int tmp = 12642364;
        int sum = 0;
        for (Function function : fArray) {
            tmp = function.calculate(tmp);
            sum += tmp;
        }
        System.out.println(sum);
    }
}
