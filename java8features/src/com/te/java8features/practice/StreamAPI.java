package com.te.java8features.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class StreamAPI {
	public static void main(String[] args) {

		HashSet<Integer> list=new HashSet<Integer>();
		
		list.add(3);
		list.add(1);
		list.add(2);
		
	//	list.stream().sorted().forEach(System.out::println);
		
		list.stream().skip(1).forEach(System.out::println);
	}
}
