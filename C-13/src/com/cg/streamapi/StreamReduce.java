package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamReduce {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,12,-3,4,15,-6,7,8);
		//retrive the stream
		Stream<Integer> stream = list.stream();
		
		//Filter +ve elements
		stream = stream.filter((a) -> a>0);
		stream.forEach(System.out::println);
	}

}
