package com.cg.dayfive.hierarchical;

public class StatesOfIndia {
	private String Countryname;

	public String getCountryname() {
		return Countryname;
	}

	public void setCountryname(String countryname) {
		Countryname = countryname;
	}
	

	public StatesOfIndia() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public StatesOfIndia(String countryname) {
		super();
		Countryname = countryname;
	}

	@Override
	public String toString() {
		return "India [Countryname=" + Countryname + "]";
	}
	
}
