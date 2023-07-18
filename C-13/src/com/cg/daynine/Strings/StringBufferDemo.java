package com.cg.daynine.Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("MSAJCE");
		System.out.println(a);
		System.out.println(a.capacity());
		System.out.println(a.length());
		
		int b= 20;
		System.out.println(a.append(b));
		System.out.println(a.reverse());
	}

}
