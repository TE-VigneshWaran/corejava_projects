package com.te.collection.sortings.queu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class QueuString {

	public static void main(String[] args) {
		PriorityQueue<String> queu = new PriorityQueue<String>();

		queu.add("dname");
		queu.add("bname");
		queu.add("cname");
		queu.add("aname");
		queu.add("ename");
		
		ArrayList<String> list = new ArrayList<String>(queu);

		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);


	}

}
