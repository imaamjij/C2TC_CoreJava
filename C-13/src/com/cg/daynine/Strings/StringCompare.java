package com.cg.daynine.Strings;

public class StringCompare {
	public static void main(String[] args) {
		//String using literals
		String s1= "MSAJCE";
		String s2= "MSAJCE";
		
		//String using new keyword
		String s3 = new String("MS AJ CE");
		String s4 = new String("MS AJ CE");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println("s1 == s2 "+(s1==s2));
		System.out.println("s1 equal s2 "+s1.equals(s2));
		
		System.out.println(s1.compareTo("msajce"));
		System.out.println(s1.compareToIgnoreCase("msajce"));
	}

}
