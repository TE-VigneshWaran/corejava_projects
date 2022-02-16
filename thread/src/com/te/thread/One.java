package com.te.thread;

public class One extends Thread {

	@Override
	public void run() {
		System.out.println("Thread One Start");
		for (int i = 0; i < 10; i++) {

			System.out.println(i);
		}
		System.out.println("Thread One End");
	}

}
