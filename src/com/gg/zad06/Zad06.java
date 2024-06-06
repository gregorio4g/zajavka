package com.gg.zad06;

import org.jetbrains.annotations.NotNull;

public class Zad06 {
    public static void main(String @NotNull [] args) {
        String input;
        if (args.length > 0) {
            input = getString(args);
        } else {
            System.out.println("No args!");
            return;
        }

        System.out.print("\nZadanie 06 01\n");
        System.out.println(zad06_01(input));

        System.out.print("\nZadanie 06 01\n");
        System.out.printf("Zdanie \"%s\" %sjest palindromem.\n", input, zad06_02(input) ? "" : "nie ");
    }

    private static boolean zad06_02(@NotNull String s) {
        // 0-64, 91-96, 123-127
        StringBuilder sb = new StringBuilder(s);
        for (char i = 0; i <= 64; i++) {
            while (sb.indexOf(Character.toString(i)) >= 0) {
                sb.deleteCharAt(sb.indexOf(Character.toString(i)));
            }
        }
        for (char i = 91; i <= 96; i++) {
            while (sb.indexOf(Character.toString(i)) >= 0) {
                sb.deleteCharAt(sb.indexOf(Character.toString(i)));
            }
        }
        for (char i = 123; i <= 127; i++) {
            while (sb.indexOf(Character.toString(i)) >= 0) {
                sb.deleteCharAt(sb.indexOf(Character.toString(i)));
            }
        }
        StringBuilder sbReversed = sb.reverse();
        return sb.toString().equalsIgnoreCase(sbReversed.toString());
    }

    private static @NotNull String zad06_01(@NotNull String s) {
        StringBuilder sb = new StringBuilder(s);
        return (sb.reverse().toString());
    }

    private static @NotNull String getString(String @NotNull [] s) {
        StringBuilder sb = new StringBuilder();
        for (String string : s) {
            sb.append(string).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
