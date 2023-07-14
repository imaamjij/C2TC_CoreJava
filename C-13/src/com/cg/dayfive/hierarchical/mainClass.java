
package com.cg.dayfive.hierarchical;

public class mainClass {

	public static void main(String[] args) {
		State1 s1 = new State1();
		State2 s2 = new State2();
		State3 s3 = new State3();
		State4 s4 = new State4();
		
		s1.setCountryname("India");
		s1.setS1name("Tamil Nadu");
		s2.setS2name("Kerala");
		s3.setS3name("Andhra Pradhesh");
		s4.setS4name("Telagana");
		
		System.out.println(s1);

		System.out.println(s2);

		System.out.println(s3);

		System.out.println(s4);
		
	}

}
