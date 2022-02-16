package com.te.thread;

public class SingleTon {

	private SingleTon() {
		
	}
	
	public static SingleTon singleTon=null;
	
	public static SingleTon getsingle() {
		if(singleTon == null) {
			singleTon= new SingleTon();
		}
		return singleTon;
		
	}
}
