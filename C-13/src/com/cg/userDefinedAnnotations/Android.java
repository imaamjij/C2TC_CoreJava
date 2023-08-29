package com.cg.userDefinedAnnotations;

@SmartPhone(os = "Android", version = 4)
@SmartTV(os = "GoogleTV", width = 60, height = 70)
public class Android {
	
	String model;
	int ScreenSize;
	
	public Android(String model, int screenSize) {
		super();
		this.model = model;
		ScreenSize = screenSize;
	}
	
	

}
