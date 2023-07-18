package com.cg.daynine.Strings;

public class StringMethods {

	public static void main(String[] args) {
		String a = "	Hi, This is Imaam Jaffar";
		
		System.out.println(a.charAt(12));
		System.out.println(a.length());
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.trim());
		System.out.println(a.strip());
		System.out.println(a.isEmpty());
		System.out.println(a.substring(12));
		System.out.println(a.substring(12, 17));
	}

}
