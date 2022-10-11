package com.gg.zad10;

public class GGException extends Exception {

	public GGException() {
		super("GGException is thrown.");
	}

	GGException(String message) {
		super(message);
	}

	public GGException(String message, Throwable cause) {
		super(message, cause);
	}
}
