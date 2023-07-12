package com.cg.dayfour2;

public class ConstructorClass {
	//normal method
	void print() {
		System.out.println("Normal method");
	}
	//default constructor
	public ConstructorClass() {
		System.out.println("Default Constructor");
	}
	//Parameterized constructor
	public ConstructorClass(int a) {
		System.out.println("Parameterized Constructor");
		System.out.println(a);
	}
}
