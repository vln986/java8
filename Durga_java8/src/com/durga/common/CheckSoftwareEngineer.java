package com.durga.common;

import java.util.function.Predicate;

import com.durga.entity.SoftwareEngineer;

public class CheckSoftwareEngineer {
	
	public static void main(String args[]){
		SoftwareEngineer[] seList = {
				new SoftwareEngineer("Ram", 11, false),
				new SoftwareEngineer("Krishna", 25, false),
				new SoftwareEngineer("Chintu", 18, true),
				new SoftwareEngineer("Bantu", 17, true),
				new SoftwareEngineer("Rajesh", 20, true)
		};
		
		Predicate<SoftwareEngineer> p = s -> s.age >= 18 && s.ishavingGF == true;
		System.out.println("Allowed software engineers are :");
		for(SoftwareEngineer se : seList){
			if(p.test(se)){
				System.out.println(se);
			}
		}
	}

}
