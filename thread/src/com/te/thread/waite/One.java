package com.te.thread.waite;

public class One extends Thread {

	@Override
	public synchronized void run() {
		try {
			wait(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Thread One Start");
		for (int i = 0; i < 10; i++) {

			System.out.println(i);
		}

		System.out.println("Thread One End");
	}

}
