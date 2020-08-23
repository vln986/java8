package com.durga.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.durga.common.sort.search.EmployeeSortByName;
import com.durga.common.sort.search.EmployeeSortBySalary;
import com.durga.entity.Employee;

public class EmployeeList {
	
	public static void main(String args[]){
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("D","Manager",91234.32,"Bangalore"));
		empList.add(new Employee("B","Delivery Manager",71234.32,"Kerala"));
		empList.add(new Employee("C","Sr.Associate",77234.32,"Chennai"));
		empList.add(new Employee("S","Associate",63234.32,"Bangalore"));
		empList.add(new Employee("e","Architech",23234.32,"Bangalore"));
		
		System.out.println(empList);
		
		List<String> list = empList.stream().filter(emp -> emp.salary > 3000).map(e->e.getEmpName()).collect(Collectors.toList());
		
//		list.forEach(s -> System.out.println(s.toUpperCase()));
	    List<String> uNames = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());	
	    uNames.forEach(s -> System.out.println(s.toUpperCase()));
		
		List<String> sNames = list.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		sNames.forEach(s -> System.out.println(s.toUpperCase()));
	    
		System.out.println(list);
		
		
		
		//Collections.sort(empList, new EmployeeSortByName());
		
		Collections.sort(empList, new EmployeeSortBySalary());
		
		empList.sort(Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getSalary));
		Collections.sort(empList);
		
		System.out.println(empList);
	}

}
