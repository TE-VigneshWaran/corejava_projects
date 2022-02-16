package com.te.collection.practice;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee (1,"aname",5000));
		list.add(new Employee (5,"dname",7000));
		list.add(new Employee (2,"ename",4000));
		list.add(new Employee (4,"cname",6000));
		list.add(new Employee (3,"bname",3000));
		
		Comparator<Employee> ref=(a,b)->{
			return (int) (a.getSal()-b.getSal());
		};
		
		list.stream().filter(a->a.getSal()>5000).forEach(System.out::println);
			

	}

}
