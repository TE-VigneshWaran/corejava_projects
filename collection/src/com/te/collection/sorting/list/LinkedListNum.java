package com.te.collection.sorting.list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListNum {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);

		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);


	}

}
