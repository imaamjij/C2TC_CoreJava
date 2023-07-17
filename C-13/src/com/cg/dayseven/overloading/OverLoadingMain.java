package com.cg.dayseven.overloading;

public class OverLoadingMain {

	public static void main(String[] args) {
		MethodOverLoading mo = new MethodOverLoading();
		System.out.println(mo.add(5, 10));
		System.out.println(mo.add(1.5f, 2.5f));
		System.out.println(mo.add(10, 20, 30));
		System.out.println(mo.add("Imaam", " Jaffar"));
		
		Point p=new Point();
		System.out.println(p);
		
		Point p1= new Point(11.6f);
		System.out.println(p1);
		
		p = new Point(1.2f,2.3f);
		System.out.println(p);
	}

}
