package com.te.collection.sorting.list;

import java.util.Collections;
import java.util.Vector;

public class VectorString {

	public static void main(String[] args) {
		
		Vector<String> vec=new Vector<String>();
		
		vec.add("dname");
		vec.add("bname");
		vec.add("cname");
		vec.add("aname");
		vec.add("ename");
		
		Collections.sort(vec);
		System.out.println(vec);
		
		Collections.reverse(vec);
		System.out.println(vec);


	}

}
