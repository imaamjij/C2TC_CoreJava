package com.cg.dayfifteen.generics;

import java.util.ArrayList;

public class UpperBoundWildcardDemo {
	public static Double add(ArrayList<? extends Number> a) {
		double sum=0.0;
		for(Number n:a) {
			sum += n.doubleValue();
		}
		return sum;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("Sum is :"+add(al));
		
		ArrayList<Double> al1 = new ArrayList<>();
		al1.add(10.5);
		al1.add(20.4);
		al1.add(30.6);
		System.out.println("Sum is :"+add(al1));
	}

}
