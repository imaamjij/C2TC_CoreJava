package com.cg.dayseven.overriding;

public class RBI {
	public float getRateOfInterest() {
		return 7.6f;
	}
}

class SBI extends RBI{
	public float getRateOfInterest() {
		return 8.7f;
	}
}

class HDFC extends SBI{
	public float getRateOfInterest() {
		return 9.8f;
	}
}