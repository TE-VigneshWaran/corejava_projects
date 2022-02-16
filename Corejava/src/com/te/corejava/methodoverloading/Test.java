package com.te.corejava.methodoverloading;

public class Test {

	public static void main(String[] args) {

		Good ref = new Good();
		ref.show(5);
		ref.show(1, 's');
		ref.show(0, 0.0);

	}

}
