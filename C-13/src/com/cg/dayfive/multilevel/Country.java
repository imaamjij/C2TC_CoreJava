 package com.cg.dayfive.multilevel;

public class Country {
	private String cname;
	private String capital;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [cname=" + cname + ", capital=" + capital + "]";
	}
	
}
