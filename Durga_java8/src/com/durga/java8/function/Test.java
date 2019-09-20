package com.durga.java8.function;

import java.util.function.Function;

public class Test {
	
	public static void main(String args[]) {
		
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Laxmi"));
		
		Function<Integer, Integer> square = i -> i * i;
		System.out.println(square.apply(20));
		
		Function<String, String> removeSpaces = s -> s.replaceAll(" ", "");
		System.out.println(removeSpaces.apply("Hi how are you... ... .."));
		
		Function<String, Integer> noOfSpaces = s -> s.trim().length() - s.replaceAll(" ", "").length();
		System.out.println(noOfSpaces.apply("Hi how are you. "));
		
		
		
		
	}

}
