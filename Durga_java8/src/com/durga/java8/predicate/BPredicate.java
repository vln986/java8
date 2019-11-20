package com.durga.java8.predicate;

import java.util.function.BiPredicate;

public class BPredicate {
	
	public static void main(String args[]) {
		
		BiPredicate<Integer, Integer> bp = (i1,i2) -> (i1+i2)%2==0;
		
		System.out.println(bp.test(10, 20));
		System.out.println(bp.test(15, 20));
	}

}
