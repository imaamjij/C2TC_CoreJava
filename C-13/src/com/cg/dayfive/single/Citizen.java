package com.cg.dayfive.single;

public class Citizen {
	private String Name;
	private long aadhaar;
	private String address;
	private long phNo;
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Citizen(String name, long aadhaar, String address, long phNo) {
		super();
		Name = name;
		this.aadhaar = aadhaar;
		this.address = address;
		this.phNo = phNo;
	}


	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "Citizen [Name=" + Name + ", aadhaar=" + aadhaar + ", address=" + address + ", phNo=" + phNo + "]";
	}
	
	

}
