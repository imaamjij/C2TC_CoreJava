package com.cg.dayfour1;

public class InsidePackage {
	int defVar = 10;
	public int pubVar = 20;
	private int priVar = 30;
	protected int proVar = 40;
	
	void defMethod() {
		System.out.println("Default Method");
		System.out.println("Default Variable : "+defVar);
		System.out.println("----------------------");
	}
	//public
	public void pubMethod() {
		System.out.println("Public Method");
		System.out.println("Public Variable : "+pubVar);
		System.out.println("----------------------");
	}
	//private
	
	//private variable has no access
	//private variable access only inside the class with getter and setter
		
	private void priMethod() {
		System.out.println("Private Method");
		System.out.println("Private Variable : "+priVar);
		System.out.println("----------------------");
	}
	//protected
	protected void proMethod() {
		System.out.println("Protected Method");
		System.out.println("Protected Variable : "+proVar);
		System.out.println("----------------------");
	}
	

}
