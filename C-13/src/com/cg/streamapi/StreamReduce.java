package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduce {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,12,-3,4,15,-6,7,8);
		//retrive the stream
		Stream<Integer> stream = list.stream();
		
		//Filter +ve elements
		stream = stream.filter((a) -> a>0);
		stream.forEach(System.out::println);
		
		//maximum no..
		Optional<Integer> result = stream.reduce((a,b) -> a>b ? a:b);
		
		if(result.isPresent()) {
			System.out.println("Maximum element is :"+result.get());
		}else {
			System.out.println("Stream is Empty");
		}
	}

}
