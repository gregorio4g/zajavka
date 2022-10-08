package com.gg.zad09.global;

import com.gg.zad09.AParent;
import com.gg.zad09.Child;

public class exc3 {
	public static void main(String[] args) {
		exc3();
	}

	private static void exc3() {
		AParent aParent = new Child();
		Child child = new Child();
		System.out.println(aParent.getName());
		System.out.println(aParent.getClassName());
		System.out.println(child.getName());
		System.out.println(child.getClassName());

	}
}
