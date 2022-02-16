package com.te.java8features.practice;

public class Employee implements Comparable<Employee>{

	private Integer id;
	
	private String name;

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return emp.name.compareTo(this.name);
	}
	
	
	
}
