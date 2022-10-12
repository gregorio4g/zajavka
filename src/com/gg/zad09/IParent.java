package com.gg.zad09;

public interface IParent {
	static String getClassName() {
		return "IParent";
	}
	default String getName() {
		return "IParent name";
	}
}
