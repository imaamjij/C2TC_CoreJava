package com.cg.predefinedAnnotations;

import java.util.ArrayList;
import java.util.List;

public class PreDefinedAnnotationDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// raw list
		@SuppressWarnings("rawtypes")
		List li = new ArrayList<>();
		li.add(10);
		li.add('J');
		li.add("Imaam");

	}

}
