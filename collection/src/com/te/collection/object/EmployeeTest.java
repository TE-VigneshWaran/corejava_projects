package com.te.collection.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Bala", 23, 3);
		Employee emp2 = new Employee("Ram", 22, 4);
		Employee emp3 = new Employee("David", 21, 2);
		Employee emp4 = new Employee("Esthar", 24, 5);
		Employee emp5 = new Employee("Arun", 20, 1);

		List<Employee> list = new ArrayList<Employee> ();

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);

		/*
		 * for (int i = 0; i < list.size(); i++) { System.out.println(list); }
		 * 
		 * for (Employee employee : list) { System.out.println(employee); }
		 */

		Comparator<Employee> ref = (a, b) -> {
			// return a.getEmpName().compareTo(b.getEmpName());
			return a.getEmpAge() - b.getEmpAge();
		};

		Collections.sort(list, ref);

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
