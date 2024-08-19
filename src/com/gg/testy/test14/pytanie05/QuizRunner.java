package com.gg.testy.test14.pytanie05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println("arr1.equals(arr2) = " + (arr1.equals(arr2)));
        System.out.println("arr1 == arr2 = " + (arr1 == arr2));
        System.out.println("Arrays.equals(arr1, arr2) = " + (Arrays.equals(arr1, arr2)));

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list1.equals(list2) = " + (list1.equals(list2)));
        System.out.println("list1 == list2 = " + (list1 == list2));
    }
}
