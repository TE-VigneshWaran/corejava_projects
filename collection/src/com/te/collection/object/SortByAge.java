package com.te.collection.object;

import java.util.Comparator;

public class SortByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpAge()-o2.getEmpAge();
	}

}
