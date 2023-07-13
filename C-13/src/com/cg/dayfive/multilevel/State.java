package com.cg.dayfive.multilevel;

public class State extends Country {
	private String sname;
	private int noOfDist;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getNoOfDist() {
		return noOfDist;
	}
	public void setNoOfDist(int noOfDist) {
		this.noOfDist = noOfDist;
	}
	@Override
	public String toString() {
		return "State [sname=" + sname + ", noOfDist=" + noOfDist + ", getCname()=" + getCname() + ", getCapital()="
				+ getCapital() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}	

}
