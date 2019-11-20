package com.durga.java8.function;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BFunction {
	
	public static void main(String args[]) {
		
		BiFunction<String, String, String> bf = (s1,s2) -> s1.concat(s2);
		
		BiFunction<Integer, Integer, Integer> bi = (i1,i2) -> i1*i2;
		
		System.out.println(bi.apply(10, 20));
		
		System.out.println(bf.apply("Durga", "Soft"));
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		BiFunction<String, Integer, Student> bs = (name,marks) -> new Student(name,marks);
		
		studentList.add(bs.apply("A", 55));
		studentList.add(bs.apply("B", 55));
		studentList.add(bs.apply("C", 55));
		studentList.add(bs.apply("D", 55));
		studentList.add(bs.apply("E", 55));
		studentList.add(bs.apply("F", 55));
		
		studentList.forEach(s -> System.out.println("Name : "+s.name+" Marks : "+s.marks));
		
	}

}
