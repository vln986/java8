package com.durga.java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDOB {
	
	public static void main(String args[]) {
		
		LocalDate birthday = LocalDate.of(1986, Month.OCTOBER, 01);
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthday, today);
		
		System.out.printf("Your age is %d years %d months and %d days", p.getYears(),p.getMonths(),p.getDays());
		
		
		LocalDate deathday = LocalDate.of(1986+60, Month.OCTOBER, 01);
		Period p2 = Period.between(today, deathday);
		
		int d = p2.getYears()*365 + p2.getMonths() * 30 + p2.getDays();
		
		System.out.printf("\nYou have only %d days on earth : ", d);
	}

}
