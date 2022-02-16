package com.te.java8features.practice;

public class LambdaExTest {

	public static void main(String[] args) {

		LambdaEx ref = (a) -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello World");
			}
		};
		ref.show(5);

	}

}
