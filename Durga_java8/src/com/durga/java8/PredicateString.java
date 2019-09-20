package com.durga.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateString {
	
	public static void main(String args[]) {
		
		String[] strArr = {"Sunny","Kajal","Mallika","katrina","kareena",null,"","  "};
		String[] strArr2 = {"Sunny","Kajal","Mallika","katrina","kareena","","  "};
		Predicate<String> preStr = s ->  s.startsWith("k") || s.startsWith("K"); //s.charAt(0) == 'k';
		Predicate<String> preStr2 = s ->  s != null && !s.trim().isEmpty();
		for(String s : strArr2) {
			if(preStr.test(s)) {
				System.out.println(s);
			}
		}
		List<String> al = new ArrayList<String>();
		
		for(String s : strArr) {
			if(preStr2.test(s)) {
				al.add(s);
			}
		}
		System.out.println(al);
	}

}
