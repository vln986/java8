package com.apple.interviewPrgs;

public class Singleton implements Cloneable {
	
	public static Singleton obj = null;
	
	private Singleton() {
		
	}
	
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	public static Singleton getInstance() {
		if(obj == null) {
			obj = new Singleton();
		}
		
		return obj;
	}

}
