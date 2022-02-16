package com.te.customexception;

public class Test {

	public void myMethod() {
		int age = 17;
		if (age > 18) {
			System.out.println("you are eligible for voating");
		} else {
			throw new MyException("you are not eligible for voating");
		}
	}

	public static void main(String[] args) {

		Test ref = new Test();
		try {
			ref.myMethod();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
