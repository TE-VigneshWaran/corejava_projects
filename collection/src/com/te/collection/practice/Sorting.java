package com.te.collection.practice;

import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(3, "cname");
		map.put(5, "dname");
		map.put(1, "aname");
		map.put(4, "ename");
		map.put(2, "bname");

		Comparator<Entry<Integer, String>> comp = (Entry<Integer, String> a, Entry<Integer, String> b) -> {

			return a.getKey().compareTo(b.getKey());
		};

		List<Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(map.entrySet());

		Collections.sort(list, comp);
		
		System.out.println(list);

	}

}
