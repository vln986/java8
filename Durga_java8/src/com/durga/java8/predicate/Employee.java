package com.durga.java8.predicate;

public class Employee {
	
	public String empName;
	public String designation;
	public double salary;
	public String city;
	
	
	public Employee(String empName, String designation, double salary, String city) {
		// TODO Auto-generated method stub
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
		this.city = city;

	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString(){
		//return "EmployeeName : "+empName+ " Sal : "+salary+ " Designation : "+designation+ " city : "+city;
		String s = String.format("%s,%s,%2f,%s", empName, designation,salary,city);
		return s;
	}
}
