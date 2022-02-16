package com.te.java8features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(40);
		list.add(30);
		list.add(20);

		System.out.println(list.stream().map(x -> x * 3).collect(Collectors.toList()));
		System.out.println(list.stream().findFirst());
		System.out.println(list.stream().findAny());

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("arun");
		list1.add("NETHAJI");
		list1.add("arun");
		list1.add("Bala");
		list1.add("tamil");

		System.out.println(list1.stream().count());
		System.out.println(list1.stream().allMatch(x -> x.contentEquals("ncjv")));
		list1.stream().distinct().forEach(System.out::println);
		System.out.println(list1.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList()));
		System.out.println("=================================");
		list1.stream().sorted().forEach(System.out::println);
		System.out.println("-----------------------------------");

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("A");
		list2.add("A");
		list2.add("A");

		System.out.println(list2.stream().allMatch(x -> x.contentEquals("A")));

		ArrayList<Integer> sal = new ArrayList<>();

		sal.add(20000);
		sal.add(40000);
		sal.add(10000);
		sal.add(70000);

//	sal.stream().sorted().forEach(System.out::println);
//	System.out.println("===========================================");
//	sal.stream().forEach(System.out::println);
//	System.out.println("-------------------------------------------");
//	sal.parallelStream().forEach(System.out::println);

		List<Integer> salRes = sal.stream().sorted().collect(Collectors.toList());
		System.out.println(salRes);
		System.out.println(salRes.get(salRes.size() - 2));

	}
}
