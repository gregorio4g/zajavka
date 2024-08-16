package com.gg.zadania.zad04;

import java.time.DateTimeException;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

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
        int arg03;
        int defaultVal03 = 1;
        if (args.length > 0) {
            String s3 = args[0];
            try {
                arg03 = Integer.parseInt(s3);
            } catch (NumberFormatException e) {
                arg03 = defaultVal03;
                System.out.printf("Argument 0 to nie jest liczba: %s. -> Zmieniamy na %d\n", s3, arg03);
            }
        } else {
            arg03 = defaultVal03;
            System.out.printf("Nie ma argumentu 0. -> Zmieniamy na %d\n", arg03);
        }

        System.out.println("Liczba " + arg03 + (isEven(arg03) ? "" : " nie") + " jest parzysta.");

        System.out.print("\nZadanie 04 04\n");
        int arg04;
        int defaultVal04 = 1;
        if (args.length > 1) {
            String s4 = args[1];
            try {
                arg04 = Integer.parseInt(s4);
            } catch (NumberFormatException e) {
                arg04 = defaultVal04;
                System.out.printf("Argument 1 to nie jest liczba: %s. -> Zmieniamy na %d\n", s4, arg04);
            }
        } else {
            arg04 = defaultVal04;
            System.out.printf("Nie ma argumentu 1. -> Zmieniamy na %d\n", arg04);
        }

        Month month;
        try {
            month = Month.of(arg04);
            System.out.printf("Miesiąc %s ma %d dni.\n",month.getDisplayName(TextStyle.FULL_STANDALONE, Locale.of("pl")), howManyDaysInMonth(arg04));
        } catch (DateTimeException e) {
            System.out.printf("Nie ma takiego miesiąca: %d", arg04);
        }

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

    static int howManyDaysInMonth(int m) {
        return switch (m) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> {
                System.out.printf("Nie ma takiego miesiąca: %d!\n", m);
                yield -1;
            }
        };
    }
}
