package com.te.corejava;

public class ConstOverload {

	ConstOverload(int i) {
		System.out.println("int variable");
	}

	ConstOverload(int i, double d) {
		this(25);
		System.out.println("int variable");
	}

	public static void main(String[] args) {

		//ConstOverload ref=new ConstOverload(3, d)
	}

}
