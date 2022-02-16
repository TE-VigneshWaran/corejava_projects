package com.te.designpattern.factory;

public class FactoryTest {

	public static void main(String[] args) {

		ShapeFactory ref = new ShapeFactory();

		Shape shape = ref.getShape("circle");
		shape.show();

	}

}
