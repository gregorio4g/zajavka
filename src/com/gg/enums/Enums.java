package com.gg.enums;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Enums {
    public static void main(String @NotNull [] args) {
        Volkswagen volkswagen = getEnum();
        System.out.println("volkswagen = " + volkswagen);
        System.out.println("volkswagen.getColor() = " + volkswagen.getColor());
        System.out.println("Volkswagen.GOLF.getColor() = " + Volkswagen.GOLF.getColor());

        volkswagen.setColor("pink");
        System.out.println("volkswagen.getColor() = " + volkswagen.getColor());
        System.out.println("Volkswagen.GOLF.getColor() = " + Volkswagen.GOLF.getColor());

        System.out.println("Volkswagen.GOLF = " + Volkswagen.GOLF);

        Volkswagen[] values = Volkswagen.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));

        for (Volkswagen value : values) {
            System.out.println("value = " + value);
        }

        Volkswagen golf = Volkswagen.valueOf("GOLF");
        System.out.println("golf = " + golf);

        System.out.println("Volkswagen.GOLF.doSomething() = " + Volkswagen.GOLF.doSomething());

        Volkswagen v1 = getV("arTEON");
        Volkswagen v2 = getV("passat");

        System.out.println("v1 == v2 = " + (v1 == v2)); // this is preferred: change the v2 to Volkswagen2
        System.out.println("(v1.equals(v2)) = " + (v1.equals(v2)));

        System.out.println("Arrays.toString(Volkswagen.values()) = " + Arrays.toString(Volkswagen.values()));



    }

    private static @NotNull Volkswagen getV(String vw) {
        return Volkswagen.valueOf(vw.toUpperCase());
    }

    private static @NotNull Volkswagen2 getV2(String vw) {
        return Volkswagen2.valueOf(vw.toUpperCase());
    }

    private static @NotNull Volkswagen getEnum() {
        return Volkswagen.GOLF;
    }
}
