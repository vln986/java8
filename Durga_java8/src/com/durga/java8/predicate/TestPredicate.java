package com.durga.java8.predicate;

import java.util.function.Predicate;

public class TestPredicate {
	
	public static void m1(Predicate<Integer> p, int[] x) {
		for(int x1 : x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
	}
	
	public static void main(String args[]) {
		int[] x = {0,5,10,15,20,25,30};
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println("Numbers > 10 :");
		m1(p1, x);
		System.out.println("Even Numbers : ");
		m1(p2, x);
		//Predicate Joining
		System.out.println("> 10 and even numbers :");
		m1(p1.and(p2), x);
		System.out.println("> 10 and not even numbers :");
		m1(p1.and(p2.negate()), x);
		System.out.println("< 10 and not even numbers :");
		m1(p1.negate().and(p2.negate()), x);
		System.out.println("<= 10 and even numbers :");
		m1(p1.negate().and(p2), x);
		
	}

}
