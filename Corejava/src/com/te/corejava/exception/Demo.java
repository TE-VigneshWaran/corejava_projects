package com.te.corejava.exception;

public class Demo {

	public static void main(String[] args) {
		
		int i=5;
		int j=0;
		try {
			int k=i/j;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
