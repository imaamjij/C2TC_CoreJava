package com.cg.dayeleven.exeptionhandling;

public class NestedTry {

	public static void main(String[] args) {
		int a =5;
		int x[]= {2,6,7,4,5};
		try {
			System.out.println(a/1);
			try {
				System.out.println(x[8]);
			}catch(Exception e) {
				System.err.println(e);
			}
		}catch (Exception e) {
			System.err.println(e);
		}
	}

}
