package com.gg.zad04;

import java.util.Calendar;

public class Zad04 {
    public static void main(String[] args) {
        System.out.print("\nZadanie 04 01\n");
        int year = 0;
        System.out.println("Rok przestępny: " + year + " " + (isLeapYear(year) ? "TAK" : "NIE"));

        System.out.print("\nZadanie 04 02\n");
        Number a2 = 15.9;
        Number b2 = 123.0;
        Number c2 = 123.000001;
        System.out.printf("MAX(%f, %f, %f) = %f\n", a2, b2, c2, findMax(a2, b2, c2));

        System.out.print("\nZadanie 04 03\n");
        int arg03 = 0;
        int defaultVal = 1;
        if (args.length > 0) {
            String s3 = args[0];
            try {
                arg03 = Integer.parseInt(s3);
            } catch (NumberFormatException e) {
                arg03 = defaultVal;
                System.out.printf("Argument 0 to nie jest liczba: %s. -> Zmieniamy na %d\n", s3, arg03);
            }
        } else {
            arg03 = defaultVal;
            System.out.printf("Nie ma argumentu 0. -> Zmieniamy na %d\n", arg03);
        }

        System.out.println("Liczba " + arg03 + (isEven(arg03) ? "" : " nie") + " jest parzysta.");
    }

    private static Double findMax(Number a2, Number b2, Number c2) {
        return Math.max((Double) a2, Math.max((Double) b2, (Double) c2));
    }

    private static boolean isLeapYear(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
