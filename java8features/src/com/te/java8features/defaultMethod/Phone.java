package com.te.java8features.defaultMethod;

public interface Phone {

	 int i=19;
	
	 void call();
	
	default void message() {
		System.out.println("default method");
	}
	
	  static void display() {
		System.out.println("static method");
	}
	
	
}
