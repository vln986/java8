package com.durga.java8.function;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

//if input and output parameter types are same in Function interface, then we go for UnaryOperator.

public class UOperator {
	
	public static void main(String args[]) {
		
		UnaryOperator<Integer> uo = i -> i*i;
		System.out.println(uo.apply(10));
		
		IntUnaryOperator io = i -> i*i;
		System.out.println(io.applyAsInt(20));
	
	}

}
