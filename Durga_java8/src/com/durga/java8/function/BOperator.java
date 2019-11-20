package com.durga.java8.function;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

//if 2 input and 1 output parameter types are same in BiFunction, then we go for BinaryOperator.

public class BOperator {
	
	public static void main(String args[]) {
		
		BinaryOperator<String> bo = (s1,s2) -> s1+s2;
		System.out.println(bo.apply("durga", "soft"));
		
		IntBinaryOperator ib = (i1,i2) -> i1*i2;
		System.out.println(ib.applyAsInt(10, 20));
		
	}

}
