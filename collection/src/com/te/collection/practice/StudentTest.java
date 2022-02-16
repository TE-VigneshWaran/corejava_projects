package com.te.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentTest {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student("cname", 5));
		list.add(new Student("aname", 1));
		list.add(new Student("dname", 4));
		list.add(new Student("bname", 2));
		list.add(new Student("ename", 3));

		Comparator<Student> ref = (a, b) -> {
			return a.getName().compareTo(b.getName());

		};

		Collections.sort(list, ref);
		System.out.println(list);
	}

}
