package com.te.thread.unnable;

class OneTest {

	public static void main(String[] args) {

		System.out.println("main starts");
		One one = new One();

		Thread one1 = new Thread(one);

		one1.start();

		Two two = new Two();
		Thread two2 = new Thread(one);

		two2.start();
		System.out.println("main ends");
	}

}
