package com.te.collection.sorting.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistString {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
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
