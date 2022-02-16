package com.te.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("aravinth");
		list.add("dinesh");
		list.add("bala");
		list.add("ganesh");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
