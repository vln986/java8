package com.durga.java8.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeLocal {
	
	public static void main(String args[]) {
		
		LocalDateTime dt = LocalDateTime.now();
		
		int i = 12;double d = 12.34;char c = '1';
		char c2 = (char) i;
		double d2 = i;
		int x = c;
		
		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yyyy = dt.getYear();
		
		int hr = dt.getHour();
		int min = dt.getMinute();
		int sec = dt.getSecond();
		int ns = dt.getNano();
		
		System.out.printf("%d - %d - %d", dd,mm,yyyy);
		System.out.println();
		System.out.printf("%d : %d : %d : %d", hr,min,sec,ns);
		System.out.println();
		
		LocalDateTime ldt = LocalDateTime.of(1995, Month.MAY, 05, 23, 12);
		
		System.out.println(ldt);
	    System.out.println("After six months : "+ldt.plusMonths(6));
	    System.out.println("Before six months : "+ldt.minusMonths(6));
		
	}

}
