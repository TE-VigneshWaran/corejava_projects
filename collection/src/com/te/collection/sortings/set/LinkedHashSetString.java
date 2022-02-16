package com.te.collection.sortings.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetString {

	public static void main(String[] args) {

		Set<String> linkedhashSet = new LinkedHashSet<String>();

		linkedhashSet.add("bname");
		linkedhashSet.add("dname");
		linkedhashSet.add("cname");
		linkedhashSet.add("aname");
		linkedhashSet.add("ename");

		ArrayList<String> list = new ArrayList<String>(linkedhashSet);

		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);

	}

}
