package com.te.java8features.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {

	public static void main(String[] args) {
		List<Integer> sal=new java.util.ArrayList<Integer>();
		
		sal.add(20000);
		sal.add(40000);
		sal.add(10000);
		sal.add(70000);


		List<Integer> salRes = sal.stream().filter((a)->a>5000.00).collect(Collectors.toList());
		System.out.println(salRes);
		System.out.println(salRes.get(salRes.size() - 2));


	}

}
