package com.cg.daysix.static1;

public class StaticMethod {
	private int no; //non-static or instance variable
	private static int reg; //static or class variable
	
	//static block
	static {
		System.out.println("Static Block");
		reg=10;
		//no=5; because non static variable cannot be accessed
		//inside static block
	}
	
	//constructor
	StaticMethod(){
		System.out.println("Default Consrtuctor");
		no++;
		reg++;
	}

	@Override
	public String toString() {
		return "StaticMethod [no=" + no + ", reg=" + reg+"]";
	}
	
	static void display() {
		System.out.println("reg : "+reg);
		//System.out.println("no : "+no);
		//non static variable cannot be accessed inside the static method
	}
}
