package com.gg.test14;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		quiz();

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

	private static void quiz() {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(null);
		set.add(2);
		for (Integer integer : set) {
			System.out.print(integer);
		}

		System.out.println();
	}
}
