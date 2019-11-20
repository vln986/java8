package com.durga.java8.function;

import java.util.function.BiFunction;

public class CalculateEmpSal {
	
	public static void main(String args[]) {
		
		BiFunction<Employees, TimeSheet, Double> empSal = (e,t) -> e.dailyWage*t.workingDays;
		
		double sal = empSal.apply(new Employees(10, "A", 1000), new TimeSheet(10, 28));
		System.out.println(sal);
		
	}

}
