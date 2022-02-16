package com.te.thread;

class OneTest {

	public static void main(String[] args) {

		System.out.println("main starts");
		One one = new One();
		one.start();

		Two two = new Two();
		two.start();
		System.out.println("main ends");
	}

}
