package com.cg.dayfourteen.userdefinedobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Student> li =new ArrayList<Student>();
		Student s= new Student(10, "Imaam", 86.5f);
		li.add(s);
		s=new Student(10,"Imaam",80.5f);
		li.add(s);
		System.out.println(s);
		
		System.out.println("Before sorting :"+li);
		
		ListIterator<Student> i=li.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("After sorting ");
		Collections.sort(li);
		System.out.println(li);
		
		
	}

}
