package com.durga.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.durga.java8.function.Employee;

public class MaxSalEmp {
	
	public static void main(String args[]) {
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1,"A", 10000));
		emplist.add(new Employee(2,"B", 20000));
		emplist.add(new Employee(3,"C", 30000));
		
		Employee emp = emplist.stream(). max(Comparator.comparing(Employee::getSalary)).get();
		
		System.out.println("emp = "+emp.getSalary());
	}

}
