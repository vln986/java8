package com.durga.java8.supplier;

import java.util.function.Supplier;

public class RandomName {
	
	public static void main(String args[]) {
		
		Supplier<String> s = () -> {
			String[] strArr = {"A", "B", "C", "D"};
			int x = (int)(Math.random() *4);
			return strArr[x];
		};
		
		System.out.println(s.get());
	}

}
