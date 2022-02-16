package com.te.collection.sortings.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new java.util.HashMap<Integer, String>();

		map.put(1, "bname");
		map.put(2, "aname");
		map.put(4, "dname");
		map.put(3, "cname");

		Comparator<Entry<Integer, String>> comp = (Entry<Integer, String> a1, Entry<Integer, String> a2) -> {
			return a1.getValue().compareTo(a2.getValue());
			
			
			
		};

		ArrayList<Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(map.entrySet());

		Collections.sort(list, comp);
		
		System.out.println(list);
	}

}
