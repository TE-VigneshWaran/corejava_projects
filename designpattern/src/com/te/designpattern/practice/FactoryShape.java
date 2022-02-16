package com.te.designpattern.practice;

public class FactoryShape {

	public Shape getShape(String type) {
		
		if(type==null) {
			return null;
		}
		else if(type.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		else if(type.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
}
