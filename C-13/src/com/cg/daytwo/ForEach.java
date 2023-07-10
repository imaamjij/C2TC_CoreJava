package com.cg.daytwo;

public class ForEach {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		// ForEach only used for array elements
		for(int i:a) {
			System.out.println(i);
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
