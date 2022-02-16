package com.te.corejava.wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		int i=10;
		Integer integer= new Integer(i);
		System.out.println(integer);
		
		String string= new String("120");
		
		
       System.out.println( Integer.parseInt(string));		
		
		
	}
	
}
