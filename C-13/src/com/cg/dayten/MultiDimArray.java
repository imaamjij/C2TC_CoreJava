package com.cg.dayten;

public class MultiDimArray {

	public static void main(String[] args) {
		int a[][] = {{5,10},{25,20},{50,35}};
		for(int i = 0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
