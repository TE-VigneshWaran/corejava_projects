package com.te.corejava.string;

public class Immutable {

	public static void main(String[] args) {
		
		String ref = "aaa";
		System.out.println(ref.hashCode());
		
		String ref1 = "aaa";
		System.out.println(ref1.hashCode());
		
		ref = "bbb";
		
		System.out.println(ref.hashCode());
	
		StringBuffer ref4 = new StringBuffer("cccc");
		System.out.println(ref4.hashCode());
		
		StringBuffer ref5 = new StringBuffer("cccc");
		System.out.println(ref5.hashCode());
		
		  ref4.append("naveen");
		System.out.println(ref4.hashCode());	
		System.out.println(ref4);
		
	}
}
