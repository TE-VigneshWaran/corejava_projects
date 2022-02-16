package com.te.collection.object;

import java.io.Serializable;

public class Employee implements Serializable  {

	public Employee() {

	}

	private String empName;

	private Integer empAge;

	private Integer empExperience;

	public String getEmpName() {
		return empName;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empExperience=" + empExperience + "]";
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee(String empName, int empAge, int empExperience) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empExperience = empExperience;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public int getEmpExperience() {
		return empExperience;
	}

	public void setEmpExperience(int empExperience) {
		this.empExperience = empExperience;
	}

}
