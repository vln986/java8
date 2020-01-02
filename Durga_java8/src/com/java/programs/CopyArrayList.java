package com.java.programs;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CopyArrayList {
	
	public static void main(String args[]) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> commonList = new ArrayList<String>();
		
		list1.add("A");
		list1.add("B");
		list1.add("C");list1.add("E");
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		
		/*
		 * for(String s1 : list1) { for(String s2 : list2) { if(s1.equals(s2)) {
		 * commonList.add(s1); } } }
		 */
		
		//commonList.forEach(value -> System.out.println(value))
		list1.forEach(v -> System.out.println(v));
		//list1.retainAll(list2);
		//System.out.println("After retain");
		//list1.forEach(v -> System.out.println(v));
		
		commonList =  (ArrayList<String>) list1.stream().filter(list2::contains).collect(Collectors.toList());  // in Java 8
		System.out.println("After retain");
		commonList.forEach(v -> System.out.println(v));
		
	}

}
