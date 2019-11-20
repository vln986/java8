package com.durga.java8.function;

import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntFunction {
	
	public static void main(String args[]) {
		
		java.util.function.IntFunction<Integer> if1 = i -> i*i;
			System.out.println(if1.apply(5));
			
			ToIntFunction<String> s = i -> i.length();
			System.out.println(s.applyAsInt("laxman"));
			
			IntToDoubleFunction id = i -> Math.sqrt(i);
			System.out.println(id.applyAsDouble(7));
			
			
	}

}
