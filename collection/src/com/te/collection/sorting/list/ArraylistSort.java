package com.te.collection.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistSort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(4);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);

		Collections.sort(list);
		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);

	}

}
