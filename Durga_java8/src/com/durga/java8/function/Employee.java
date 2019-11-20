package com.durga.java8.function;

public class Employee {
	
	String name;
	public double salary;
	
	public Employee(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
		
	}
	
	public String toString() {
		return name+ " : "+salary;
	}

}
