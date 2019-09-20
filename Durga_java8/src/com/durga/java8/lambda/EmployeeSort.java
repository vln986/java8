package com.durga.java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeSort {
	
	public static void main(String args[]) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Avigna"));
		empList.add(new Employee(2, "Avigna"));
		empList.add(new Employee(3, "SwethaSree"));
		empList.add(new Employee(4, "Avigna"));
		empList.add(new Employee(5, "Prasanna"));
		
		System.out.println("Before sorting "+empList);
		
		empList.sort(Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getEmpId)); //empList.stream().filter(
		System.out.println("After sorting "+empList);
		
		
	}

}
