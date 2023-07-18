package com.cg.dayeleven.exeptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		int x,y,z;
		try {
			x=5;
			y=0;
			z=x/y;
		}catch(ArithmeticException e) {
			System.err.println(e);
		}catch(NumberFormatException e) {
			System.err.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		}catch(NullPointerException e) {
			System.err.println(e);
		}
	}

}
