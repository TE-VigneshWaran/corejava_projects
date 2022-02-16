package com.te.java8features.practice;

public class LambdaTest {

	public static void main(String[] args) {

		Lambda ref = (a) -> {
			for (int i = 1; i <= a; i++) {
				System.out.println("Hello World");
			}
		};

		ref.show(5);
	}

}
