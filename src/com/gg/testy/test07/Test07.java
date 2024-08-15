package com.gg.testy.test07;

import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) {
        System.out.println("Pytanie 01");
        int[][] someArray = new int[5][10]; // A
//        String[][][] matrix = new String[][0][5]; // B
        String[][][] matrix2 = new String[0][10][5]; // C
        String cars[][] = new String[2][]; // D
//        int[][] types = new int[]; // E
//        int[][] java = new int[][]; // F
//        int[] array = new array[]; // G
//        int[] array2 = new int[]; // H
        int[] array3 = new int[10]; // I

        System.out.println("Pytanie 02");
        quiz2();

        System.out.println("Pytanie 03");
        quiz3();

        System.out.println("Pytanie 04");
        quiz4();

        System.out.println("Pytanie 05");
        quiz5();

        System.out.println("Pytanie 06");
        quiz6();

        System.out.println("Pytanie7");
        quiz7(new String[]{"x", "y"}, new String[]{"z", "a"});

        System.out.println("Pytanie8");
        System.out.println(varArgsExample(1,new int[]{1, 2, 3}));
    }

    private static int varArgsExample(int arg, int... varArgs) {
        return varArgs.length;
    }

    private static void quiz7(String[] arr1, String[] arr2) {
        System.out.println(Arrays.toString(arr2));
    }

    private static void quiz6() {
        int result6 = 0;
        int[][] arr = {{1, 2, 2}, {5, 0, 7}, {4, 3, 8, 2}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result6 += arr[i][j++];
            }
            result6 -= arr[i][0];
        }
        System.out.println("result6 = " + result6);
    }

    private static void quiz5() {
        int[] arr = {1, -2, 5, 10, -14, -2};
        int search = 5;
        int result5 = Arrays.binarySearch(arr, search);
        System.out.println("result5 = " + result5);
    }

    private static void quiz4() {
        int[][] arr = {{1, 2, 2}, {5, 0, 7}, {4, 3, 8, 2}};
        System.out.println(Arrays.toString(arr[1]));
    }

    private static void quiz3() {
        int[][] arr = {{1, 2, 2}, {5, 0, 7}, {4, 3, 8, 2}};
        System.out.println(arr[1]);
    }

    private static void quiz2() {
        int[] arr = new int[2];
        int size = arr.length;
    }
}
