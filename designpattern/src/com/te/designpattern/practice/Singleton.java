package com.te.designpattern.practice;

public class Singleton {

	private Singleton() {
		
	}
	
	static Singleton singleton=null;
	
	static Singleton getSingleton() {
		if(singleton==null) {
			singleton=new Singleton();
		}
		return singleton;
	}
}
