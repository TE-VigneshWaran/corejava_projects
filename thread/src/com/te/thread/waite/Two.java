package com.te.thread.waite;

public class Two extends Thread {

	@Override
	public synchronized void run() {
		
		notify();
		
		System.out.println("Thread Two Start");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("Thread Two End");
		System.out.println("Waiting....");
		
	}
	
	
}
