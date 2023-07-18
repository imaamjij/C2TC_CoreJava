package com.cg.dayeleven.exeptionhandling;

public class InvalidAgeExeption extends Exception {
	public InvalidAgeExeption() {
		super("Invalid Age");
	}

	public InvalidAgeExeption(String string) {
		super(string);
	}
}

