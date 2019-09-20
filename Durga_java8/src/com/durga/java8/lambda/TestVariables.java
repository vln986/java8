package com.durga.java8.lambda;

interface Interf{
	public void m1();
}

public class TestVariables {
	
	int x = 10;
	public void m2() {
		int y = 20;
		Interf i = () -> {
			System.out.println(x);
			System.out.println(y);
		};
		i.m1();
			
	}
	public static void main(String args[]) {
		TestVariables t = new TestVariables();
		t.m2();
	}

}
