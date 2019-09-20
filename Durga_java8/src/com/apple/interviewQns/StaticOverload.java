package com.apple.interviewQns;

public class StaticOverload {
	
	public static void main(String[] args) {
		
		StaticOverload.display(2,3);
		StaticOverload.display();
	}
	
	public static void display() {
		System.out.println("default static method");
	}
	public static void display(int a, int b) {
		System.out.println("Parameter static method");
	}

}
