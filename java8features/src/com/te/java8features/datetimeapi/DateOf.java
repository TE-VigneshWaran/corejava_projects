package com.te.java8features.datetimeapi;

import java.time.LocalDate;
import java.time.Month;

public class DateOf {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.of(1998, Month.NOVEMBER, 04);//(1998,04,11)
		System.out.println(date);
	}
}
