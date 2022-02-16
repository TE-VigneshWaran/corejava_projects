package com.te.corejava;

import java.util.Scanner;

//sum of ascii value of given string

public class Test {

	public static void main(String[] args) {

		Scanner ref = new Scanner(System.in);

		System.out.println("Enter the String");

		String str = ref.nextLine();

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			int asciiValue = str.charAt(i);
			sum = sum + asciiValue;

		}
		
		System.out.println("ASCII of " + str + "=" + sum);
	}

}
