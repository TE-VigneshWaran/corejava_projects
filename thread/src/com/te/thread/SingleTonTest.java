package com.te.thread;

public class SingleTonTest {
	
	public static void main(String[] args) {
		
		SingleTon single1=SingleTon.getsingle();
		System.out.println(single1.hashCode());
	
		SingleTon single2=SingleTon.getsingle();
		System.out.println(single2.hashCode());
		
	}
}
