package com.cg.dayseven.overriding;

public class OverRidingDemo {

	public static void main(String[] args) {
		RBI r = new RBI();
		SBI s = new SBI();
		HDFC h = new HDFC();
		System.out.println(r.getRateOfInterest());
		System.out.println(s.getRateOfInterest());
		System.out.println(h.getRateOfInterest());
	}

}
