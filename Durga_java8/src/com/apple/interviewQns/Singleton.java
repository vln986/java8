package com.apple.interviewQns;

public class Singleton implements Cloneable {
	
	public Singleton obj = null;
	
	private Singleton() {
		
	}
	
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	public Singleton getInstance() {
		if(obj == null) {
			obj = new Singleton();
		}
		
		return obj;
	}

}
