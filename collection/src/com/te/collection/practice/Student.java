package com.te.collection.practice;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;
	
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	
}
