package com.te.corejava.string;

public class Demo {

	public static void main(String[] args) {

		String str="vicky";
		
		String str1="vicky";
		
		System.out.println(str.equals(str1));
		
		StringBuffer ref1=new StringBuffer("vicky");
		
		StringBuffer ref=new StringBuffer("vicky");
		
		System.out.println(ref.equals(ref1));
		
	}

}
