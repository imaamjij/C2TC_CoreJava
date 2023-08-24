package com.cg.lambdaExpression;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		
		Statement s = () ->{return "Hello world!!!";};
		System.out.println(s.greet());
	}

}
