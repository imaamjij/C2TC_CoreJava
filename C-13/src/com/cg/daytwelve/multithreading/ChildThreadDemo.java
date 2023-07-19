package com.cg.daytwelve.multithreading;

public class ChildThreadDemo {

	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(5,"First Thread");
		ChildThread t2 = new ChildThread(5,"Second Thread");
		
		t1.start();
		t2.start();
	}

}
