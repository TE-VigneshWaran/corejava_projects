package com.te.collection.sortings.queu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class QueuNum {

	public static void main(String[] args) {

		PriorityQueue<Integer> queu = new PriorityQueue<Integer>();

		queu.add(4);
		queu.add(2);
		queu.add(3);
		queu.add(1);
		queu.add(5);

		ArrayList<Integer> list = new ArrayList<Integer>(queu);

		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);

	}

}
