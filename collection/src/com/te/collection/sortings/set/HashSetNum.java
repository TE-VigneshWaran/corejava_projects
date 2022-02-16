package com.te.collection.sortings.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetNum {

	public static void main(String[] args) {

		Set<Object> hashSet = new HashSet<Object>();

		hashSet.add(3);
		hashSet.add(null);
		hashSet.add(5);
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		
		System.out.println(hashSet);

		/*
		 * ArrayList<Integer> list = new ArrayList<Integer>(hashSet);
		 * 
		 * Collections.sort(list); System.out.println(list);
		 * 
		 * Collections.reverse(list); System.out.println(list);
		 */
	}

}
