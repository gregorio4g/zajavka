package com.gg.zadania.zad09;

public class exc05 {
	private static void exc5() {
		IParent iParent = new AnotherChild();
		AnotherChild anotherChild = new AnotherChild();

		System.out.println(iParent.getName());
		System.out.println(IParent.getClassName());

		System.out.println(anotherChild.getName());
		System.out.println(AnotherChild.getClassName());
	}

	public static void main(String[] args) {
		exc5();
	}
}
