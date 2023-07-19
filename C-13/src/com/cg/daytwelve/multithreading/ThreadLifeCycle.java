package com.cg.daytwelve.multithreading;

public class ThreadLifeCycle extends Thread {
	@Override
	public void run() {
		System.out.println("Is thread is alive in run(): "+this.isAlive());
		int num=0;
		while(num <7) {
			num++;
			System.out.println("Number: "+num);
		}
		try {
			Thread.sleep(1000);
			System.out.println("Is thread is alive in runnable :"+this.isAlive());
		}catch(InterruptedException e) {
			System.err.println("Exception occured");
		}
	}
	
	public static void main(String[] args) {
		Thread a = new ThreadLifeCycle();
		System.out.println("Is thread is alive before runnable : "+a.isAlive());
		a.start();
		
		try {
			a.sleep(2000);
		} catch (InterruptedException e) {
			System.err.println("Exception Occured");
		}
		System.out.println("is thread is alive after execution :"+a.isAlive());
	}

}
