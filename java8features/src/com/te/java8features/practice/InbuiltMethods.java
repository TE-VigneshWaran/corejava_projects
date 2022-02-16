package com.te.java8features.practice;

import java.util.ArrayList;

public class InbuiltMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(2);
		
		list.forEach(System.out::println);
		
		
		
	}

}
