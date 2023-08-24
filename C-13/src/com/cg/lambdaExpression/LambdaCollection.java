package com.cg.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaCollection {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(70);
		list.add(20);
		list.add(60);
		list.add(50);
		
		//traversing using for each
		for(Integer element : list) {
			System.out.println(element);
		}
		
		//traversing using lambda expression
		System.out.println("Traversing using lambda expression");
		list.forEach(element -> System.out.println(element));
		
		//sorting in descending order by using lambda expression
		Comparator<Integer> compar = (n1,n2) -> n2 - n1;
		Collections.sort(list, compar);
		System.out.println("Sorted element is :"+list );
		
		//user defined type
		ArrayList<Student> student = new ArrayList<Student>();
		Student s= new Student(10, "Imaam", 86);
		student.add(s);
		s= new Student(11, "Jaffar", 80);
		student.add(s);
		s= new Student(12, "Afsar", 85);
		student.add(s);
		s= new Student(13, "Yoga", 95);
		student.add(s);
		s= new Student(14, "Alan", 83);
		student.add(s);
		
		System.out.println(student);
		
		Comparator<Student> compare = (std1, std2) -> std1.getName().compareTo(std2.getName());
		Collections.sort(student, compare);
		System.out.println("Sorted in Ascending Order : "+student);
		
		compare=(std1, std2) -> (int)(std1.getPer() - std2.getPer());
		Collections.sort(student, compare);
		System.out.println(student);

		
	}

}
