package com.te.designpattern.practice;

public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton ref=Singleton.getSingleton();
		System.out.println(ref.hashCode());
		Singleton ref2=Singleton.getSingleton();
		System.out.println(ref2.hashCode());
		

	}

}
