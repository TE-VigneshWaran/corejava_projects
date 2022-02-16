package com.te.collection.sorting.list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListString {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("dname");
		list.add("bname");
		list.add("cname");
		list.add("aname");
		list.add("ename");
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);


	}

}
