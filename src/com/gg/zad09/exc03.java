package com.gg.zad09;

public class exc03 {
	public static void main(String[] args) {
		exc3();
	}

	private static void exc3() {
		AParent aParent = new Child();
		Child child = new Child();
		System.out.println(aParent.getName());
		System.out.println(AParent.getClassName());
		System.out.println(child.getName());
		System.out.println(Child.getClassName());

	}
}
