package com.te.java8features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeMethods {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(2);
		list.add(1);

		System.out.println("...sortted...");

		List<Integer> listsort = list.stream().sorted().collect(Collectors.toList());
		System.out.println(listsort);

		System.out.println(".......Distinct.......");

		List<Integer> listdis = list.stream().distinct().collect(Collectors.toList());

		System.out.println(listdis);

		System.out.println("...count...");

		long listcount = list.stream().count();
		System.out.println(listcount);

		System.out.println("...skip...");

		List<Integer> listskip = list.stream().skip(3).collect(Collectors.toList());

		System.out.println(listskip);

		System.out.println("...map...");

		List<Integer> listmap = list.stream().map((a) -> {
			if (a % 2 == 0) {
				return a;
			} else {
				return a - 1;
			}
		}).collect(Collectors.toList());

		System.out.println(listmap);

	}
}
