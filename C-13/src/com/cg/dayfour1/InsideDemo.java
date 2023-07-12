package com.cg.dayfour1;

public class InsideDemo {

	public static void main(String[] args) {
		InsidePackage ip = new InsidePackage();
		
		
		// private variable or method access only inside the class
	
		ip.defMethod();
		ip.proMethod();
		ip.pubMethod();
		
		ip.defVar = 14;
		ip.defMethod();
		
		ip.pubVar = 25;
		ip.pubMethod();
		
		ip.proVar = 35;
		ip.proMethod();
		
		//private variable has no access
		//ip.priVar = 55;

		//private variable access only inside the class with getter and setter
		
		
		//instaceOf
		System.out.println(ip instanceof InsidePackage);
	}

}
