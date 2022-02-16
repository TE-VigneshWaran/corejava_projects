package com.te.java8features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {

		System.out.println("Number sorting");

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(4);

		System.out.println(list.stream().sorted().collect(Collectors.toList()));

		List<String> str = new ArrayList<String>();

		str.add("vicky");
		str.add("siva");
		str.add("guna");
		str.add("ram");
		str.add("bala");

		System.out.println(str.stream().filter(a -> a.startsWith("v")).collect(Collectors.toList()));

		System.out.println("content equal");
		System.out.println(str.stream().allMatch(b->b.contentEquals("guna")));
		
		str.stream().sorted().forEach(System.out::println);
		
		
		
	}

}
