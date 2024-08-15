package com.gg.zadania.zad09;

public class exc02 {
	public static void main(String[] args) {
		exc2();
	}

	private static void exc2() {
		Static static1 = new Static("A");
		System.out.printf("Name: %s, counter: %d%n", static1.getName(), static1.getCounter());
		Static static2 = new Static("B");
		System.out.printf("Name: %s, counter: %d%n", static2.getName(), static1.getCounter());
		Static static3 = new Static("C");
		System.out.printf("Name: %s, counter: %d%n", static3.getName(), static3.getCounter());
		Static static4 = new Static("D");
		System.out.printf("Name: %s, counter: %d%n", static4.getName(), static4.getCounter());
		Static static5 = new Static("E");
		System.out.printf("Name: %s, counter: %d%n", static5.getName(), static5.getCounter());

	}
}
