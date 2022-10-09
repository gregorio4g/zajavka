package com.gg.zad09;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class AnotherChild implements IParent {
	@Contract(pure = true)
	public static @NotNull String getClassName() {
		return "AnotherChild";
	}
	@Override
	public String getName() {
		return "AnotherChild name";
	}
}
