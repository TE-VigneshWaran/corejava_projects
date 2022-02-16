package com.te.java8features.streamapi;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class StreamApiMethods {

	public static void main(String[] args) {
		List<Integer> integer = new ArrayList<Integer>();

		integer.add(3);
		integer.add(7);
		integer.add(4);
		integer.add(8);
		integer.add(1);
		integer.add(2);
		integer.add(9);
		integer.add(10);
		integer.add(10);
		System.out.println("Original : " + integer);

		List<Integer> odd = integer.stream().map(a -> {
			if (a % 2 != 0) {
				return a;
			} else {
				return a - 1;
			}
		}).collect(Collectors.toList());

		System.out.println("Odd : " + odd);

		System.out.println("-------- distinct --------");
		List<Integer> disList = integer.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct : " + disList);
		System.out.println();

		System.out.println("---------- count ---------");
		long count = integer.stream().count();
		System.out.println("count :" + count);
		System.out.println();

		System.out.println("--------- skip ---------");
		System.out.println("before skip :" + integer);
		List<Integer> skipList = integer.stream().skip(5).collect(Collectors.toList());
		System.out.println("after skip :" + skipList);
		System.out.println();

//			System.out.println("---------- filters ----------");
//			System.out.println("before filter :"+integer);
//			List<Integer> filteredList = integer.stream().filter(x->x%2!=0).collect(Collectors.toList());
//			System.out.println("after filter :"+filteredList);
//			System.out.println();

	}
}
