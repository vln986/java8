package com.durga.java8.datetime;

import java.time.Year;
import java.util.Scanner;

public class LeapYr {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter year number : ");
		
		int year = sc.nextInt();
		sc.close();
		
		Year y = Year.of(year);
		
		if(y.isLeap()) {
			System.out.printf("%d is the leap year",year);
		}else {
			System.out.printf("%d is not a leap year", year);
		}
		
	}

}
