package com.cg.dayfourPackage2;

import com.cg.dayfour1.InsidePackage;

public class OutsidePackageDemo {

	public static void main(String[] args) {
		InsidePackage ii = new InsidePackage();
		
		ii.pubMethod();
		
		ii.pubVar = 100;
		ii.pubMethod();
		
	}

}
