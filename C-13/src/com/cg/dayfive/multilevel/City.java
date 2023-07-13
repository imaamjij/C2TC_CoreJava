package com.cg.dayfive.multilevel;

public class City extends State{
	private String cityname;
	private int pin;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", pin=" + pin + ", getSname()=" + getSname() + ", getNoOfDist()="
				+ getNoOfDist() + ", toString()=" + super.toString() + ", getCname()=" + getCname() + ", getCapital()="
				+ getCapital() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
