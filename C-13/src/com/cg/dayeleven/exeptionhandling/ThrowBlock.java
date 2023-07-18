package com.cg.dayeleven.exeptionhandling;

import java.util.Scanner;

public class ThrowBlock {

	public static void main(String[] args) {
	int per;
	System.out.println("Enter Percentage: ");
	Scanner sc = new Scanner(System.in);
	per = sc.nextInt();
	try {
		if(per < 0) {
			throw new ArithmeticException("Percentage should not less than 0");
		}
		else if(per > 100) {
			throw new ArithmeticException("Percantage Greater");
		}
		else {
			System.out.println("Percentage is "+per);
		}
	}catch(ArithmeticException e) {
		System.err.println("Error ! "+e.getMessage());
	}
	System.out.println("Out of Flow");
	}

}
