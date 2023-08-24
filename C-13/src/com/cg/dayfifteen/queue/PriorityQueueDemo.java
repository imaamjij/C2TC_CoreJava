package com.cg.dayfifteen.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();
		pq.add("Chennai");
		pq.add("Trichy");
		pq.add("Tiruvannamalai");
		
		System.out.println(pq);
	}

}
