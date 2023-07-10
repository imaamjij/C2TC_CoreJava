package com.cg.daytwo;

public class OperatorClass {

	public static void main(String[] args) {
		//Arithmetic Operators(+, -, *, / ,%)
		int a = 50 , b = 10;
		float c;
		c=a+b;
		System.out.println("Added Value : "+c);
		c=a-b;
		System.out.println("Subtracted Value : "+c);
		c=a*b;
		System.out.println("Multipled Value : "+c);
		c=a/b;
		System.out.println("Divided Value : "+c);
		c=a%b;
		System.out.println("Moded Value : "+c);
		
		System.out.println("---------------------------------------");
		
		//Logical Operators(&&, ||, !)
		int a1=5,b1=10;
		if((a>b)&&(b<a)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		if((a>b)||(b<a)){
			System.out.println("True");
		}else {
			System.out.println("False");
		}
//		//if((a>b)(b<a)){
//			System.out.println("True");
//		//}else {
//			System.out.println("False");
//		}
			
		System.out.println("---------------------------------------");
		
		
		//Relational Operators(<, <=, >, >=, ==, !=)
		int A=5,B=10;
		if(A>B) {
			System.out.println("A is Greater");
		}else {
			System.out.println("B is Greater");
		}
		
		if(A>=B) {
			System.out.println("A is Greater");
		}else {
			System.out.println("B is Greater");
		}
		
		if(A<B) {
			System.out.println("B is Greater");
		}else {
			System.out.println("A is Greater");
		}
		
		if(A<=B) {
			System.out.println("B is Greater");
		}else {
			System.out.println("A is Greater");
		}
		
		if(A==B) {
			System.out.println("A==B");
		}else {
			System.out.println("A!=B");
		}
		if(A!=B) {
			System.out.println("A!=B");
		}else {
			System.out.println("A==B");
		}
		
		
		
		System.out.println("---------------------------------------");
		
		//Increment $ Decrement (++, --)
		int aa=4;
		System.out.println("initial value : "+aa);
		aa++;
		System.out.println("After increment  : "+aa);
		aa--;
		System.out.println("After decrement  : "+aa);
		
		System.out.println("---------------------------------------");
		
		
		//Bitwise Operators(>>, <<, &, |,)
		
	}
}
