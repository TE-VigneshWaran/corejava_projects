package com.te.collection.sorting.list;

import java.util.Collections;
import java.util.Vector;

public class VectorNum {

	public static void main(String[] args) {
		
		Vector<Integer> vec=new Vector<Integer>();
		
		vec.add(4);
		vec.add(2);
		vec.add(3);
		vec.add(1);
		vec.add(5);

		Collections.sort(vec);
		System.out.println(vec);
		
		Collections.reverse(vec);
		System.out.println(vec);


	}

}
