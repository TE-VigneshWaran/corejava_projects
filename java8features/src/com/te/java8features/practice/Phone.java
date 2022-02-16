package com.te.java8features.practice;

public interface Phone {

	void call();
	
	default void show() {
		System.out.println("default method");
	}
	
	static void display() {
		System.out.println("static method");
	}
}
