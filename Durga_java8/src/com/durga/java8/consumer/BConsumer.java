package com.durga.java8.consumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import com.durga.java8.function.Employee;

public class BConsumer {
	
	public static void main(String args[]) {
		
		BiConsumer<String, String> bc = (s1,s2) -> System.out.println(s1.concat(s2));
		
		bc.accept("A", "B");
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		BiFunction<String, Integer, Employee> bs = (name,sal) -> new Employee(name,sal);
		
		empList.add(bs.apply("A", 55));
		empList.add(bs.apply("B", 55));
		empList.add(bs.apply("C", 55));
		empList.add(bs.apply("D", 55));
		empList.add(bs.apply("E", 55));
		empList.add(bs.apply("F", 55));
		
		BiConsumer<Employee, Double> bc2 = (e,d) -> e.salary = e.salary + d;
		
		empList.forEach(e -> bc2.accept(e, 500.0));
		empList.forEach(e -> System.out.println(e));
		
	}

}
