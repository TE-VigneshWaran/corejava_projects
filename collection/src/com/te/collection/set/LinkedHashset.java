package com.te.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();

		set.add(3);
		set.add(4);
		set.add(1);
		set.add(5);
		set.add(2);
		set.add(null);

		System.out.println(set);// [3, 4, 1, 5, 2, null]

	}

}
