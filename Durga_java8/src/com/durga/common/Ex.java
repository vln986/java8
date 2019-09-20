package com.durga.common;

class Sample {
	
	String name;
	
	Sample(String name){
		System.out.println("parameterized constuc");
		this.name = name;
	}

}

public class Ex{
	public static void main(String args[]) {
		Sample s = new Sample("ddd");
	}
}
