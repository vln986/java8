package com.durga.java8.interf;

public interface Interf {
	
	default void m1() {
		System.out.println("Printing from interface m1() method...");
	}
	public static void m2() {
		System.out.println("Hello....Printing...from interfate");
	}
	
	public static void main(String args[]) {
		System.out.println("Printing from interface");
	}

}
