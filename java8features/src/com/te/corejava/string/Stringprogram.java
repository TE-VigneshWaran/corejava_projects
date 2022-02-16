package com.te.corejava.string;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

public class Stringprogram {
	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer("naveen");
		StringBuffer buffer2 = new StringBuffer("naveen");

		System.out.println(buffer.hashCode());
		System.out.println(buffer2.hashCode());

		String muttable = "vicky";
		String mutable1 = "vicky";

		System.out.println(mutable1.hashCode());
		System.out.println(muttable.hashCode());
		System.out.println(buffer2.append("vicky"));
		
		List<Integer> list=new ArrayList<Integer>();
		


	}
}
