package com.gg.tests15;

public class AnotherGarbageCollectionQuiz {
	public static void main(String[] args) {
		AnotherGarbageCollectionQuiz one = new AnotherGarbageCollectionQuiz();
		AnotherGarbageCollectionQuiz two = new AnotherGarbageCollectionQuiz();
		AnotherGarbageCollectionQuiz three = two;
		two = null;
		AnotherGarbageCollectionQuiz four = one;
		three = null;
		one = null;
		four = null;
		one = new AnotherGarbageCollectionQuiz();
		System.gc();
	}
}
