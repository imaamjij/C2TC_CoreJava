package com.cg.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		//create a stream for set of values
		Stream<Integer> s = Stream.of(10, 20, 30, 40, 50, 60);
		
		//count no. of elements
		System.out.println("No. of elements is : "+s.count());
		
		Integer[] value = new Integer[] {10, 20, 30, 13, 10, 11, 12, 13};
		
		//create the stream of array
		s= Arrays.stream(value);
		
		//map
		System.out.println("Square of "+Arrays.toString(value)+"is as follows");
		s=s.map(m -> m*m);
		s.forEach(System.out::println);
		
		//limit
		System.out.println("First 2 Elements: ");
		Arrays.stream(value).limit(2).forEach(System.out::println);
		
		//skip
		System.out.println("Skip 2 Elements: ");
		Arrays.stream(value).skip(3).forEach(System.out::println);
		
		//distinct
		System.out.println("First 2 Elements: ");
		Arrays.stream(value).distinct().forEach(System.out::println);
	}

}
