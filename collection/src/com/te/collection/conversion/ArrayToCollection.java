package com.te.collection.conversion;

import java.util.ArrayList;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
		
		int []arr= {3,2,4,5,1,6};
		
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		System.out.println(list);

	}

}
