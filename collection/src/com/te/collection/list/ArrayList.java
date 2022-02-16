package com.te.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new java.util.ArrayList<Integer>();

		list.add(1);
		list.add(5);
		list.add(4);
		list.add(2);

		System.out.println(list);

		System.out.println(list.isEmpty());// false

		System.out.println(list.size());// 5

		System.out.println(list.contains(4));// true

		list.remove(4);
		System.out.println(list);// [1,5,3,4]

		list.set(3, 2);
		System.out.println(list);// [1,5,3,2]

		System.out.println(list.get(0));// 1

		Collections.sort(list);// [1,2,3,5]

		Collections.swap(list, 1, 2);// [1,3,2,5]

		/*
		 * skip the element and print the remaining elemnt Iterator<Integer> itr =
		 * list.iterator(2); while (itr.hasNext()) { System.out.println(itr.next());
		 */

		Iterator<Integer> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
