package com.te.collection.set;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
	
		TreeSet <Integer> tree=new TreeSet<Integer>();
		
		tree.add(4);
		tree.add(1);
		tree.add(3);
		tree.add(2);
		tree.add(5);
		
		System.out.println(tree);//[1, 2, 3, 4, 5]
		
		System.out.println(tree.descendingSet());//[5, 4, 3, 2, 1]
		
		System.out.println(tree.pollFirst());//1
		
		System.out.println(tree.pollLast());//5
		
		System.out.println(tree.first());//2
		
		System.out.println(tree.last());//4
	}

}
