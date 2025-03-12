package com.apple.interviewPrgs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.durga.java8.function.Employee;

public class CommonElementsList {
	public static void main(String args[]) {
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1,"A", 10000));
		emplist.add(new Employee(2,"B", 20000));
		emplist.add(new Employee(3,"C", 30000));
		emplist.add(new Employee(4,"D", 30000));
		
		List<Integer> empids = new ArrayList();
		empids.add(1);
		empids.add(2);
		empids.add(4);
		empids.add(5);
		
		emplist.stream().forEach(e -> System.out.println(e));
		List<Employee> employeeListById = new ArrayList();
		
		//filtering emplist based on ids available in empids using streams
		
		employeeListById = emplist.stream().filter(emp -> empids.contains(emp.getEmpId()))
				.collect(Collectors.toList());
		employeeListById.stream().forEach(emp -> System.out.println(emp));
		
		//grouping based on employee salary
		
		emplist.stream().collect(Collectors.groupingBy(Employee::getSalary));
		
		
		List<String> list1 = new ArrayList();
		list1.add("Abhi");
		list1.add("laxmi");
		list1.add("sagar");
		list1.add("raju");
		
		List<String> list2 = new ArrayList();
		list2.add("ADD");
		list2.add("robert");
		list2.add("laxmi");
		list2.add("Abhi");
		list2.add("raheem");
		List<String> list3 = new ArrayList();
		
		list3 = list1.stream().filter(list2::contains).collect(Collectors.toList());
		
		list3.stream().forEach(l -> System.out.println(l));
		
		emplist.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		
		
	}

}
