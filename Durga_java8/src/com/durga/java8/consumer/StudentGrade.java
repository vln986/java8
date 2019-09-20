package com.durga.java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGrade {
	
	public static void main(String args[]) {
		
		List<Student> list = new ArrayList<Student>();
		populateStudents(list);
		Function<Student, String> f = s -> {
			int marks = s.marks;
			if(marks >= 80) {
				return "A(Distinction)";
			}else if(marks >=60) {
				return "B(FirstClass)";
			}else if(marks >=50) {
				return "C(Second class)";
			}else if(marks >=35) {
				return "D(Third class)";
			}else {
				return "Fail";
			}
		};
		
		Predicate<Student> p = s -> s.marks >= 35;
		
		Consumer<Student> c = s ->{
			System.out.println("name : "+s.name);
			System.out.println("marks : "+s.marks);
			System.out.println("grade : "+f.apply(s));
			System.out.println("----------------");
		};
		
		for(Student s : list) {
			if(p.test(s)) {
				c.accept(s);
			}
		}
		
		
	}
	
	public static void populateStudents(List<Student> list) {
		list.add(new Student("Bunny", 24));
		list.add(new Student("Sunny", 100));
		list.add(new Student("chinny", 99));
		list.add(new Student("Vinny", 45));
		list.add(new Student("Pinny", 25));
	}
	
	

}
