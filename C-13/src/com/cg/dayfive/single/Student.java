package com.cg.dayfive.single;

public class Student extends Citizen{
	private int rollNo;
	private String college;
	public Student() {
		super();
	}
	public Student(String name, long aadhaar, String address, long phNo) {
		super(name, aadhaar, address, phNo);
	}
	public Student(int rollNo, String college) {
		super();
		this.rollNo = rollNo;
		this.college = college;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", college=" + college + ", getName()=" + getName() + ", getAadhaar()="
				+ getAadhaar() + ", getAddress()=" + getAddress() + ", getPhNo()=" + getPhNo() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
