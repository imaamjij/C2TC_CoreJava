package com.cg.daysix.static1;

public class StaticVariable {
	//instance variable
	private int rollNo;
	private String name;
	
	//static variable
	static String collegeName = "MSAJCE";
	
	//declare a parameterized constructor
	StaticVariable(int rollNo,String name){
		this.name=name;
		this.rollNo=rollNo;
	}

	@Override
	public String toString() {
		return "StaticVariable [rollNo=" + rollNo + ", name=" + name + ", College Name = " + collegeName +"]";
	}
	
}
