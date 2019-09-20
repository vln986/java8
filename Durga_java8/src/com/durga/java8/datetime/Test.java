package com.durga.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {
	
	public static void main(String args[]) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		System.out.printf("%d-%d-%d", dd,mm,yyyy);
		System.out.println();
		
		int hr = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int ns = time.getNano();
		
		System.out.printf("%d : %d : %d : %d", hr,min,sec,ns);
		System.out.println();
		
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println(dt);
		
	
	}
	

}
