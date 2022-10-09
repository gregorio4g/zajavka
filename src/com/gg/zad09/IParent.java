package com.gg.zad09;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface IParent {
	@Contract(pure = true)
	static @NotNull String getClassName() {
		return "IParent";
	}
	default String getName() {
		return "IParent name";
	}
}
