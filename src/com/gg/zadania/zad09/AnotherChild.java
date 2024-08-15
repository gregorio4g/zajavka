package com.gg.zadania.zad09;

public class AnotherChild implements IParent {
	public static String getClassName() {
		return "AnotherChild";
	}
	@Override
	public String getName() {
		return "AnotherChild name";
	}
}
