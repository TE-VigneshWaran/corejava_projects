package com.te.designpattern.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton ref = Singleton.getsingleton();
		System.out.println(ref.hashCode());
		Singleton ref2 = Singleton.getsingleton();
		System.out.println(ref2.hashCode());

	}

}
