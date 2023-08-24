package com.cg.dayfourteen.predefineobject;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
//		list.remove(30);
//		System.out.println(list);
		
		list.removeFirstOccurrence(30);
		System.out.println(list);
		list.removeLastOccurrence(30);
		System.out.println(list);
		
	}

}
