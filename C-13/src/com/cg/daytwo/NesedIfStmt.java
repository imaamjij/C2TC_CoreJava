package com.cg.daytwo;

public class NesedIfStmt {

	public static void main(String[] args) {
		if(4>3) {
			System.out.println("Outer Statement");
			if(3>4){
				System.out.println("Inner Statement");
			}
			System.out.println("Outer Statement 2");
		}
	}

}
