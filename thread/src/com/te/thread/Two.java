package com.te.thread;

public class Two extends Thread {

	@Override
	public void run() {
		System.out.println("Thread Two Start");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("Thread Two End");
		
	}
	
	
}
