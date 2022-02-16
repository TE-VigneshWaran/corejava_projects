package com.te.java8features.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ForEach {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(3);
		
		Collections.sort(list);
		
		list.forEach((i)->{
			System.out.println(i);
		});
		

	}

}
