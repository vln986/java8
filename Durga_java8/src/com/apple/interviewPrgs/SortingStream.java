package com.apple.interviewPrgs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.durga.java8.function.Employee;

public class SortingStream {
	
	public static void main(String args[]){{
		
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1,"A", 10000));
		emplist.add(new Employee(2,"B", 20000));
		emplist.add(new Employee(3,"C", 30000));
		emplist.add(new Employee(4,"D", 30000));
		
		//descending order using streams
		
		List<Employee> descEmpList = emplist.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		
		//ascending order using streams
		
		List<Employee> ascEmpList = emplist.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		
		
		
		
	}

}
