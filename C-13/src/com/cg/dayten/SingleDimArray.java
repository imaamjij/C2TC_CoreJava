package com.cg.dayten;

import java.util.Arrays;

public class SingleDimArray {

	public static void main(String[] args) {
		int array[]= {11,25,15,35,30,45,40};
		System.out.println(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("---------------");
		Arrays.sort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
