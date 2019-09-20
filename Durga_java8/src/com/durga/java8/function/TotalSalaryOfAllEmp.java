package com.durga.java8.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class TotalSalaryOfAllEmp {
	
	public static void main(String args[]) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		populateEmployees(list);
		
		Function<ArrayList<Employee>, Double> f = l -> {
			double total = 0;
			for(Employee e : l) {
				total = total + e.salary;
			}
			return total;
		};
		
		 Double totalSalary = f.apply(list);
		 System.out.println("Total Salary = "+totalSalary);
		 
		 
		 //----------------  Finding employees sal < 3500 and giving increament 1000 rupees
		 
		 Predicate<Employee> p = e -> e.salary < 3500;
		 ArrayList<Employee> list2 = new ArrayList<Employee>();
		 
		 Function<Employee, Employee> f2 = emp -> {
			 emp.salary = emp.salary + 1000;
			 return emp;
		 };
		 
		 for(Employee e: list) {
			 if(p.test(e)) {
				 list2.add(f2.apply(e));
			 }
		 }
		
		 
		 Double totalSalAfterIncreament = f.apply(list2);
		 System.out.println("Total salary after increament :" +totalSalAfterIncreament);
	}
	
	public static void populateEmployees(ArrayList<Employee> list) {
		list.add(new Employee("Bunny", 2400));
		list.add(new Employee("Sunny", 10000));
		list.add(new Employee("chinny", 9900));
		list.add(new Employee("Vinny", 4500));
		list.add(new Employee("Pinny", 2500));
	}

}
