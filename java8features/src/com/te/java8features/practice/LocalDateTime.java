package com.te.java8features.practice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateTime {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		Date date1= new Date();
		System.out.println(date1);

	}

}
