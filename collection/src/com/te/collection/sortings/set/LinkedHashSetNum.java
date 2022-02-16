package com.te.collection.sortings.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetNum {

	public static void main(String[] args) {

		Set<Object> linkedhashSet = new LinkedHashSet<Object>();

		linkedhashSet.add(4);
		linkedhashSet.add(5);
		linkedhashSet.add(null);
		linkedhashSet.add(null);
		linkedhashSet.add(2);
		linkedhashSet.add(3);
		System.out.println(linkedhashSet);

		//ArrayList<Integer> list = new ArrayList<Integer>(linkedhashSet);

		/*
		 * //Collections.sort(list); System.out.println(list);
		 * 
		 * Collections.reverse(list); System.out.println(list);
		 */

	}

}
