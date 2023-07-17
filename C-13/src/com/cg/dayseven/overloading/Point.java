package com.cg.dayseven.overloading;

public class Point {
	private float x;
	private float y;
	
	public Point() {
		System.out.println("Default");
		x = 0.0f;
		y = 0.0f;
	}
	
	
	// this is constructor overloading
	public Point(float x) {
		this.x = x;
		this.y=x;
	}
	
	public Point(float x, float y) {
		this.x = x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

}
