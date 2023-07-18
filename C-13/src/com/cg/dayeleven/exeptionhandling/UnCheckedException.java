package com.cg.dayeleven.exeptionhandling;

public class UnCheckedException {

	public static void main(String[] args) {
		int x[];
		x =new int[] {1,2,3,4,5};
//		System.out.println(x[7]);
		try {
			x =new int[] {1,2,3,4,5};
			System.out.println(x[7]);
		}catch(ArrayIndexOutOfBoundsException e) 
		//we can also use  (Exception e)
		{
			System.err.println(e);
		}finally { // its is one of part of Exception handling 
			System.out.println("Whatever happen it will execute");
		}
		System.out.println("Normal Flow");
	}

}
