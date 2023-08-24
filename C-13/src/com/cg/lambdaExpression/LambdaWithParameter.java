package com.cg.lambdaExpression;

public class LambdaWithParameter {

	public static void main(String[] args) {
		int x=5;
		Cube c = (int a) -> {
			return a*a*a;
		};
		
		int res = c.calculate(5);
		System.out.println(res);
		
		IsOdd o = (a) -> 
			a%2!=0 ?true:false;
			
			boolean result = o.CheckOdd(7);
			System.out.println(result);
	}

}
