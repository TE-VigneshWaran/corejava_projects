package com.te.java8features.lambdaexpression;

public class LambdaTest {

	public static void main(String[] args) {

		LambdaEx ref = (i) -> {
			System.out.println(i * 2);
		};
		ref.show(2);

	}

}
