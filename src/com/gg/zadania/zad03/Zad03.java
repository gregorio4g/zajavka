package com.gg.zadania.zad03;

public class Zad03 {
    public static void main(String[] args) {
        System.out.print("\nZadanie 03 01\n");
        doubleOperations(-2.5, 0);

        System.out.print("\nZadanie 03 02\n");
        int x2 = 0;
        zad03_02(x2);

        System.out.print("\nZadanie 03 03\n");
        byte x3 = 15;
        zad03_03(x3);

        System.out.print("\nZadanie 03 04\n");
        whichColour();

        System.out.print("\nZadanie 03 05\n");
        if (args.length > 0) {
            zad03_05(args[0]);
        } else {
            System.out.println("No arg[0]!");
        }
    }

    private static void zad03_05(String arg) {
        int i = Integer.parseInt(arg);
        int v1 = 3;
        int v2 = 7;
        System.out.printf("Liczba %d %sdzieli się przez %d.\n", i, i % v1 == 0 ? "" : "nie ", v1);
        System.out.printf("Liczba %d %sdzieli się przez %d.\n", i, i % v2 == 0 ? "" : "nie ", v2);
        System.out.printf("Liczba %d %sdzieli się przez %d.\n", i, i % (v1 * v2) == 0 ? "" : "nie ", v1 * v2);
    }

    private static void whichColour() {
        String[] kredki = {"czerwony", "zielony", "niebieski", "czarny", "żółty", "brązowy"};
        int howManyLines = 100;
        System.out.println(kredki[howManyLines % kredki.length - 1]);
    }

    private static void zad03_03(byte x3) {
        System.out.println(x3);
        int x3i = x3;
        System.out.println(x3i);
        long x3l = x3i;
        System.out.println(x3l);
        float x3f = x3l;
        System.out.println(x3f);
        double x3d = x3f;
        System.out.println(x3d);
    }

    private static void zad03_02(int x) {
        if (x == x++) {
            System.out.println(x);
        }
        if (!(x != x)) {
            System.out.println((x -= 15));
            System.out.println(x *= 3);
        }
    }

    private static void doubleOperations(double d1, double d2) {
        System.out.printf("%.2f + %.2f = %.4f\n", d1, d2, d1 + d2);
        System.out.printf("%.2f - %.2f = %.4f\n", d1, d2, d1 - d2);
        System.out.printf("%.2f * %.2f = %.4f\n", d1, d2, d1 * d2);
//        if (d2 == 0.0) {
//            System.out.println("dzielenie przez 0.0");
//        } else {
            System.out.printf("%.2f / %.2f = %.4f\n", d1, d2, d1 / d2);
//        }
    }
}
