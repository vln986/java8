package com.durga.java8.MCreference;

interface interf{
	public void m1();
}

public class Test {
	
	public static void main(String args[]) {
		
		interf i = Test::m2;   //advantage of method reference is code reusability
		
		i.m1();
	}
	
	public static void m2() {
		System.out.println("Method reference example...");
	}

}
