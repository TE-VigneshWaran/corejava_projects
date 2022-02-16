package com.te.java8features.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		//External loops
		/*
		 * for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i)); }
		 */
		
		/*
		 * for(int i:list) { System.out.println(i); }
		 */
		//Internal loops(much more faster than inner loops)
		list.forEach(i->System.out.println(i));
		
	}
}
