package com.durga.java8.interf;

public interface Left {
	default void m1() {
		System.out.println("printing from left interface...");
	}
	static void m2() {
		
		System.out.println("from static method");
	}
}
