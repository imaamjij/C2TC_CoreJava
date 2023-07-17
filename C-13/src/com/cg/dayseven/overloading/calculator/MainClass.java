package com.cg.dayseven.overloading.calculator;

public class MainClass {

	public static void main(String[] args) {
		Calculator c =new Calculator();
		
		System.out.println(c.add(5, 10));
		System.out.println(c.add(2.5f, 3.5f));
		
		System.out.println(c.sub(5, 10));
		System.out.println(c.sub(2.5f, 3.5f));
		
		System.out.println(c.mul(5, 10));
		System.out.println(c.mul(2.5f, 3.5f));
		
		System.out.println(c.div(5, 10));
		System.out.println(c.div(2.5f, 3.5f));
		
		
	}

}
