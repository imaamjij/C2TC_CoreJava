package com.cg.dayfourteen.predefineobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List list1 = new ArrayList();//raw ArrayList ie. heterogeneous data
		System.out.println("Size : "+list1.size());
		System.out.println("Is my list is Empty: "+list1.isEmpty());
		list1.add(10);
		list1.add('A');
		list1.add(true);
		list1.add("Imaam");
		list1.add(11.06);
		list1.add(2003);
		
		System.out.println(list1);
		System.out.println(list1.contains(10));
		list1.remove(4);
		
		List<Integer> list2 = new ArrayList<Integer>();//homogeneous data
		list2.add(10);
		list2.add(15);
		list2.add(20);
		
		System.out.println(list2);
		
		List<String> list3 = new ArrayList<>();
		list3.add("Imaam");
		list3.add("Jaffar");
		list3.add("JIJ");
		list3.add("India");
		list3.add("TamilNadu");
		
		System.out.println("ArrayList: "+list3);
		
		Collections.reverse(list3);
		System.out.println("Reversed ArrayList :"+list3);
		
	}
}
