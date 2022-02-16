package com.te.collection.practice;

import java.io.Serializable;

public class Employee implements Serializable {

	public Employee() {

	}

	private int id;

	private String name;
	
	private double sal;

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setSal(double sal) {
		this.sal=sal;
	}
	
	public double getSal() {
		return sal;
	}
	

	public String toString() {
		return "Employee [id="+id+",name="+name+",sal="+sal+"]";
	}

	public Employee (int id,String name,double sal) {
		super();
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
}
