package com.gg.zad10;

public class Main {
	public static void main(String[] args) {
		exc01();
		wrapper();
		exc03();
	}

	private static void exc03() {
		try {
			throwsGGNext();
		} catch (GGNextException e) {
			System.out.println(e.getMessage());
		} catch (GGException e) {
			System.out.println("ala ma kota");
		} catch (Exception e) {
			System.out.println("O lala");
		}

	}

	private static void throwsGGNext() throws Exception{

	}

	private static void exc01() {
		try {
			throwExcs();
		} catch (GGException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally.");
		}
	}

	private static void throwExcs() throws GGException {
		throw new GGException("GGException rzucony.");
	}

	private static void ageChecker(int age) throws GGException {
		if (age < 21) {
			throw new GGException("Age jest do kitu");
		}
	}

	private static void wrapper() {
		try {
			ageChecker(12);
		} catch (GGException e) {
			throw new RuntimeException(e);
		}
	}
}
