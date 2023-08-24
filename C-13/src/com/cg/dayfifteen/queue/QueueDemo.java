package com.cg.dayfifteen.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q= new LinkedList<>();
		//add 0,1,2,3,4
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		System.out.println("Elements of queue: "+q);
		//FIFO
		//Remove head Element
		
		int removedElement = q.remove();
		System.out.println("Removed Element is :"+removedElement);
		
		//to view the head element
		int head = q.peek();
		System.out.println("Head :"+head);
	}

}
