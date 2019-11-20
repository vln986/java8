package com.durga.java8.predicate;

import java.util.function.IntPredicate;

public class IntPredicateEx {
	
	public static void main(String args[]) {
		
		int[] arr = {2,5,10,15,20,25};
		IntPredicate ip = i -> i % 2 == 0;
		
		for(int x : arr) {
			if(ip.test(x)) {
				System.out.println(x);
			}
		}
	}

}
