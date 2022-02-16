package com.te.designpattern.practice;

public class FactoryShapeTest {

	public static void main(String[] args) {

		FactoryShape shape = new FactoryShape();

		Shape crl = shape.getShape("circle");
		crl.show();
	}

}
