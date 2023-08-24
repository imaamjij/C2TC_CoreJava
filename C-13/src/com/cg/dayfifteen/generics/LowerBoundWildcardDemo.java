package com.cg.dayfifteen.generics;

import java.util.List;

public class LowerBoundWildcardDemo {

	public static void display(List<? super Integer> l) {
		for(Object o: l) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
