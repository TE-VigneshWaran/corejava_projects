package com.te.corejava;

//Third Largest Number

public class Demo {

	public static void main(String[] args) {

		int[] ar = { 49,34,23,100,50};

		int temp = 0;

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(ar[2]);

	}

}
