package com.te.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSorting {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "cname");
		map.put(3, "bname");
		map.put(2, "aname");

		Comparator<Entry<Integer, String>> comp = (Entry<Integer, String> a, Entry<Integer, String> b) -> {
			return a.getValue().compareTo(b.getValue());
		};
		
		List <Entry<Integer,String>> list=new ArrayList <Entry<Integer,String>> (map.entrySet());
		
		Collections.sort(list,comp);
		
		
		System.out.println(list);
		

		/*
		 * Map<Integer, String> map = new HashMap<Integer, String>();
		 * 
		 * map.put(2, "cname"); map.put(5, "aame"); map.put(3, "enme"); map.put(1,
		 * "bname"); map.put(4, "dname");
		 * 
		 * 
		 * Comparator<Entry<Integer, String>> comp = (Entry<Integer, String> a,
		 * Entry<Integer, String> b) -> { return a.getKey().compareTo(b.getKey()); };
		 * 
		 * 
		 * Comparator<Entry<Integer, String>> comp = (Entry<Integer, String> a,
		 * Entry<Integer, String> b) -> { return a.getValue().compareTo(b.getValue());
		 * };
		 * 
		 * ArrayList<Entry<Integer, String>> list = new ArrayList<Entry<Integer,
		 * String>>(map.entrySet()); Collections.sort(list, comp);
		 * System.out.println(list);
		 */
	}

}
