package com.te.corejava.methodoverloading;

public class Good {

	public void show(int i) {
		System.out.println("given integer is " + i);
	}

	public void show(int i, char c) {
		System.out.println("Integer is " + i + "character is " + c);
	}

	public void show(int i, double d) {
		System.out.println("Integer is " + i + "double number is " + d);
	}

}
