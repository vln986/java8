package com.durga.common.sort.search;

import java.util.Comparator;

import com.durga.entity.Employee;

public class EmployeeSortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}
