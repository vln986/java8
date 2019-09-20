package com.durga.java8.function;

import java.util.function.Function;

public class FunctionChaining {
	
	public static void main(String args[]) {
		
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);
		
		
		System.out.println(f1.apply("Laxminarayana"));
		System.out.println(f2.apply("laxminarayana"));
		System.out.println(f1.andThen(f2).apply("laxminarayana"));
		System.out.println(f1.compose(f2).apply("laxminarayana"));
		
		
		Function<Integer, Integer> f3 = i -> i + i;
		Function<Integer, Integer> f4 = i -> i * i * i;
		
		System.out.println(f3.andThen(f4).apply(4));    //First f3 and then f4 function
		System.out.println(f3.compose(f4).apply(4));    // first f4 and then f3
		
		// ------------ identity --------------
		
		Function<String, String> f5 = Function.identity();
		
		System.out.println(f5.apply("laxman"));
	}

}
