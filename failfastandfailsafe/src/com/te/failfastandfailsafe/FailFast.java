package com.te.failfastandfailsafe;

import java.util.ArrayList;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(int n:list) {
			System.out.println(n);
			list.add(60);
		}
		

	}

}
