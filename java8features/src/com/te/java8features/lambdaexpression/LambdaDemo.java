package com.te.java8features.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		/*
		 * list.forEach(i ->{ System.out.println(i);});
		 */
		list.forEach((n) -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
	}

}
