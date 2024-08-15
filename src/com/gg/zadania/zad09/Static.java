package com.gg.zadania.zad09;

public class Static {
	private static int counter;
	static {
		System.out.println("Creating Static class!");
	}
	private final String name;

	public Static(String name) {
		this.name = name;
		counter++;
	}

	public static int getCounter() {
		return counter;
	}

	public String getName() {
		return name;
	}
}
