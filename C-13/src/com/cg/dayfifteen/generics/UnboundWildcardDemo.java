package com.cg.dayfifteen.generics;

import java.util.List;

public class UnboundWildcardDemo {

	public static void display(List<?> l) {
		for(Object o: l) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
