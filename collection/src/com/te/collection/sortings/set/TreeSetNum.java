package com.te.collection.sortings.set;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;



public class TreeSetNum {

	public static void main(String[] args) {

		Set<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(4);

		System.out.println(treeSet);
		
		
		ArrayList<Integer> list=new ArrayList<Integer>(treeSet);
		Collections.reverse(list);
		System.out.println(list);
		
		
	
		
		
		
	}

}
