package com.cg.dayfifteen.generics;

public class GenericMethodTest {
	//Generic method
	public <E> void display(E[] elements) {
		for(E element : elements) {
			System.out.println("Element is :"+element);
		}
	}
	
	//Generic constructor
	//public <E> GenericMethodTest(E e) {
		//}
	
	public static void main(String[] args) {
		Integer[] intArray = {10,20,30,40};
		String[] str = {"AA","BB","CC"};
		
		GenericMethodTest gm = new GenericMethodTest();
		gm.display(intArray);
		gm.display(str);
	}

}
