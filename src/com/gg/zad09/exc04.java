package com.gg.zad09;

import java.util.Arrays;

public class exc04 {
	private static void	exc4() {
		int[] args = new int[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80};
		char[] arr = castToChar(args);
		System.out.println(Arrays.toString(args));
		System.out.println(Arrays.toString(arr));
	}

	private static char[] castToChar(int[] args) {
		char[] outChar = new char[args.length];
		for (int i = 0; i < args.length; i++) {
			outChar[i] = (char)args[i];
		}
		return outChar;
	}

	public static void main(String[] args) {
		exc4();
	}
}
