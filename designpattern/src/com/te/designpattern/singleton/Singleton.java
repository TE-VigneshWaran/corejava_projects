package com.te.designpattern.singleton;

public class Singleton {

	private Singleton() {

	}

	public static Singleton singleton = null;

	public static Singleton getsingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
