package com.gg;

import com.gg.zad09.global.Global;

import static com.gg.zad09.global.Global.GLOBAL_CONSTANT;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("2. Napisz taki sam program, tylko spraw, żeby na ekranie została wydrukowana treść tego zadania.");
        // exc 2 - zad 1
        String s1 = "Ala ma kota!";
        int i1 = s1.length();
        System.out.println("2-1: " + i1);
        // zad 2
        String a = "Alpha";
        String b = "Bravo";
        String c = "Charlie";
        String d = "Delta";
        String e = "Echo";
        System.out.println(a + b + c + d + e);
        System.out.println(e.concat(d).concat(c).concat(b).concat(a));
        // zad 3
        double d3 = 1.23;
        String s3 = s1.replaceAll("[aąeęioóuyAĄEĘIOÓY]", Double.toString(d3));
        System.out.println(s3);
        // zad 4
        String s4 = "Java  Server Pages";
        System.out.println("s4 " + (s4.contains("Java") ? "contains" : "does not contain") + " Java.");
        // zad 5
        String s51 = "Java";
        String s52 = "jaVa";
        System.out.println(s51+".equals("+s52+") = " + s51.equals(s52));
        System.out.println(s51+".equalsIgnoreCase("+s52+") = " + s51.equalsIgnoreCase(s52));
        // zad 6
        String s6 = "SomeStringLongerThan10Characters";
        System.out.println(s6.substring(3, 3+5));
        // exc 3 - zad 1
        zad3_1(5.1, 3.5);
        // zad 4
        System.out.println("Zad 3_4");
        String[] kolory = {"czerwony", "zielony", "niebieski", "czarny", "żółty", "brązowy"};
        System.out.println(kolory[(100 % 6) - 1]);
        // zad 5
        System.out.println("Zad 3_5");
        zad3_5(63);
        // exc 4 - zad 1
        int rok = 2016;
        System.out.println("Rok przestępny: " + rok + " " + (czyPrzestepny(rok) ? "TAK" : "NIE") );
        // exc 4 - zad 2
        int a4_2 = 3;
        int b4_2 = 2;
        int c4_2 = 1;
        System.out.printf("MAX(%d, %d, %d) = %d\n", a4_2, b4_2, c4_2, findMax(a4_2,b4_2,c4_2));
        // exc 4 - zad 3
        int num4_3 = 66;
        System.out.println("Liczba " + num4_3 + (czyParzysta(num4_3)?"":" nie") + " jest parzysta.");
        // exc 4 - zad 4
        System.out.printf("Marzec ma %d dni.\n", howManyDaysInMonth(3));
        // exc 4 - zad 5
        System.out.printf("Od początku roku do końca marca jest %d dni.\n", howManyDaysInYear(3));
        // exc 5 - zad 1
        int num5_1 = 5;
        System.out.printf("%d! = %d%n", num5_1, silnia(num5_1));
        // exc 5 - zad 2
        String s5_2 = "łaPAł";
        System.out.printf("Słowo: %s " + (palindrom(s5_2) ? "" : "nie ") + "jest palindromem.%n", s5_2);
        // exc 5 - zad 3
        christmasTree(7);
        // exc 5 - zad 4
        String[] colours = {"red", "grn", "blu", "blk", "yel", "brn"};
        for (int i = 0; i < 100; i++) {
            System.out.print(colours[i%6]+" ");
            if ((i+1)%25 == 0) System.out.println();
        }
        // exc 5 - zad 5
        // java-Deitel: c625
        // exc 5 - zad 6
        System.out.println(printNumbers(19));
        // exc 5 - zad 7
        System.out.println(fibonacci(20));
        // exc 5 - zad 8
        for (int i = 1; i < 10; i++) {
            System.out.println(i * 100 + i * 10 + i);
            for (int j = 0; j < 4; j++) {
                System.out.println("####");
            }
        }
        // exc 6 - zad 1
        String s6_1 = "Ala ma kota!";
        System.out.printf("6-1: %s <=> %s%n", s6_1, backToFrontString(s6_1));
        // exc 6 - zad 2
        String s6_21 = "Ala ma kota!";
        String s6_22 = "Kobyła ma mały bok";
        System.out.printf("6-2: Zdanie: %s " + (isPalindrom(s6_21) ? "" : "nie ") + "jest palindromem.%n", s6_21);
        System.out.printf("6-2: Zdanie: %s " + (isPalindrom(s6_22) ? "" : "nie ") + "jest palindromem.%n", s6_22);
        // exc 6 - zad 3
        int[] arr6_3 = {4,6,8,10,2,4,5};
        System.out.printf("6-3: " + Arrays.toString(arr6_3) + " <=> " + Arrays.toString(backToFrontIntArr(arr6_3)) + "%n");
        // exc 6 - zad 4
        // int[] arr6_4 = {4,6,6,8,10,2,2,4,5};
        // exc 9 - zad 1
        System.out.println("9-1");
        System.out.println(Global.GLOBAL_CONSTANT);
        System.out.println(GLOBAL_CONSTANT);
//        Global.GLOBAL_CONSTANT = "19";

        LocalDate date = LocalDate.of(2020, Month.DECEMBER, 33);
        System.out.println(date);


    }

    private static int[] backToFrontIntArr(int[] input) {
        int[] out = new int[input.length];
        for (int i = input.length; i > 0; i--) {
            out[input.length - i] = input[i-1];
        }
        return out;
    }

    private static boolean isPalindrom(String input) {
        StringBuilder sb = new StringBuilder(input.replace(" ", ""));
        return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }

    private static String backToFrontString(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public static int varArgsExample(int arg, int... varArgs) {
        return varArgs.length;
    }

    static String fibonacci(int len) {
        StringBuilder output = new StringBuilder();
        int num1 = 1;
        int num2 = 1;
        int num3;
        output.append("1,1,");
        for (int i = 0; i < len - 2; i++) {
            num3 = num1 + num2;
            output.append(num3).append(i == len - 3 ? "" : " ");
            num1 = num2;
            num2 = num3;
        }
        return output.toString();
    }

    static String printNumbers(int length) {
        StringBuilder output = new StringBuilder();
        int num1 = 39;
        int num2 = 11;
        for (int i = 0; i < length/2; i++) {
            output.append(num1).append(",").append(num2);
            output.append((i == length/2 - 1 ? "" : ","));
            num1 += 2;
            num2 -= 3;
        }
        if (length % 2 == 1) {
            output.append(",").append(num1);
        }
        return output.toString();
    }

    static void christmasTree(int num) {
        int start = (num % 2 == 0 ? 2 : 1);
        for (int i = start; i <= num; i += 2) {
            for (int j = 0; j < (num-i)/2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static boolean palindrom(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length()-1; i >= 0 ; i--) {
            sb.append(input.charAt(i));
        }
        return (input.equalsIgnoreCase(sb.toString()));
    }
    static long silnia(int i) {
        long result = 1;
        for (int j = 2; j <= i; j++) {
            result *= j;
        }
        return result;
    }

    static void zad3_1(double x, double y) {
        System.out.printf("%.2f + %.2f = %.2f\n",x, y, (x + y));
        System.out.printf("%.2f - %.2f = %.2f\n",x, y, (x - y));
        System.out.printf("%.2f * %.2f = %.2f\n",x, y, (x * y));
        System.out.printf("%.2f / %.2f = %.2f\n",x, y, (x / y));
    }

    static void zad3_5(int x) {
        System.out.printf("Liczba %d" + (x % 3 == 0 ? "" : " nie") + " jest podzielna przez 3.\n", x);
        System.out.printf("Liczba %d" + (x % 7 == 0 ? "" : " nie") + " jest podzielna przez 7.\n", x);
    }

    static boolean czyPrzestepny(int rok) {
        return (rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0);
    }

    static int findMax(int a, int b, int c) {
        int max = a;
        if(b>a) max = b;
        if(c>max) max = c;
        return max;
//        return Math.max(a, Math.max(b, c));
    }

    static boolean czyParzysta(int num) {
        return num % 2 == 0;
    }

    static int howManyDaysInMonth(int m) {
        switch(m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                System.out.printf("Nie ma takiego miesiąca: %d!\n",m);
                return -1;
        }
    }

    static int howManyDaysInYear(int m) {
        int days = 0;
        switch(m) {
            case 12: days += howManyDaysInMonth(12);
            case 11: days += howManyDaysInMonth(11);
            case 10: days += howManyDaysInMonth(10);
            case 9: days += howManyDaysInMonth(9);
            case 8: days += howManyDaysInMonth(8);
            case 7: days += howManyDaysInMonth(7);
            case 6: days += howManyDaysInMonth(6);
            case 5: days += howManyDaysInMonth(5);
            case 4: days += howManyDaysInMonth(4);
            case 3: days += howManyDaysInMonth(3);
            case 2: days += howManyDaysInMonth(2);
            case 1: days += howManyDaysInMonth(1);
            break;
            default: days += howManyDaysInMonth(m);
        }
        return days;
    }
}
