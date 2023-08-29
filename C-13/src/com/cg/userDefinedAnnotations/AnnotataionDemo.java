package com.cg.userDefinedAnnotations;

import java.text.Annotation;

public class AnnotataionDemo {

	public static void main(String[] args) {
		Android a = new Android("OnePlus 11r",13);
		System.out.println(a.model);
		System.out.println(a.ScreenSize);
		
		System.out.println("SmartPhone Details");
		
		@SuppressWarnings("rawtypes")
		Class c = a.getClass();
		
		@SuppressWarnings("unchecked")
		java.lang.annotation.Annotation an = c.getAnnotation(SmartPhone.class);
		
		SmartPhone s = (SmartPhone) an;
		System.out.println(s.os());
		System.out.println(s.version());
		
		@SuppressWarnings("unchecked")
		java.lang.annotation.Annotation ans = c.getAnnotation(SmartTV.class);
		
		SmartTV st = (SmartTV) ans;
		System.out.println(st.os());
		System.out.println(st.width());
		System.out.println(st.height());
	}

}
