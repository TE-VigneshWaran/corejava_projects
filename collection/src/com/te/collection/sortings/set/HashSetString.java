package com.te.collection.sortings.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetString {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>();

		hashSet.add("bname");
		hashSet.add("dname");
		hashSet.add("cname");
		hashSet.add("aname");
		hashSet.add("ename");

		ArrayList<String> list = new ArrayList<String>(hashSet);

		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);

	}

}
