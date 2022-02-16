package com.te.java8features.streamapi;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {

		List<String> list=new java.util.ArrayList<String>();
		
		
		list.add("aname");
		list.add("aname");
		list.add("aname");
		
	System.out.println(list.stream().anyMatch(a->a.contentEquals("aname")));
	}

}
