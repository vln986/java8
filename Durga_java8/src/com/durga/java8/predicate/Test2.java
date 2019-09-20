package com.durga.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.durga.java8.predicate.Employee;

public class Test2 {

	public static void main(String args[]) {
		List<Employee> list  = new ArrayList<Employee>();
		populate(list);
		
		Predicate<Employee> p = emp -> emp.designation.contentEquals("Manager");
		System.out.println("----- Managers -------\n");
		display(p,list);
		Predicate<Employee> p2 = emp -> emp.city.equalsIgnoreCase("Bangalore");
		System.out.println("----- Banglore employees --------\n");
		display(p2, list);
		Predicate<Employee> p3 = emp -> emp.salary < 20000;
		System.out.println("---- < 20000 sal ------\n");
		display(p3, list);
		
		System.out.println("---- Managers : bglr -----");
		display(p.and(p2).and(p3.negate()), list);
		
		
		
		
	}
	public static void populate(List<Employee> empList) {
		empList.add(new Employee("J","CEO",91234.32,"Hyderabad"));
		empList.add(new Employee("D","Manager",91234.32,"Hyderabad"));
		empList.add(new Employee("B","Delivery Manager",71234.32,"Kerala"));
		empList.add(new Employee("C","Sr.Associate",77234.32,"Chennai"));
		empList.add(new Employee("A","Associate",63234.32,"Bangalore"));
		empList.add(new Employee("E","Architech",23234.32,"Bangalore"));
		empList.add(new Employee("F","Architech",10234.32,"Bangalore"));
		empList.add(new Employee("F","Manager",23234.32,"Bangalore"));
	}
	public static void display(Predicate<Employee> p, List<Employee> emplist) {
		Predicate<Employee> p4 = Predicate.isEqual(new Employee("J","CEO",91234.32,"Hyderabad"));
		for(Employee emp : emplist) {
			if(p.test(emp)) {
				System.out.println(emp);
				System.out.println("Is CEO : " +p4.test(emp));
			}
		}
	}

}
