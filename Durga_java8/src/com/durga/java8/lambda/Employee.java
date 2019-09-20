package com.durga.java8.lambda;

public class Employee {
	
	public int empId;
	public String empName;
	
	public Employee(int empId, String empName) {
		// TODO Auto-generated constructor stub
		this.empId = empId;
		this.empName = empName;
	}
	public String toString() {
		return "id : "+empId+ " Name : "+empName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
