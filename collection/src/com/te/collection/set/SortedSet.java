package com.te.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SortedSet {

	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<Integer>(); 
		
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(5);
		set.add(2);
		set.add(2);
		set.add(null);
		
		
		System.out.println(set);//[null, 1, 2, 3, 4, 5]
		
		
		

	}

}
