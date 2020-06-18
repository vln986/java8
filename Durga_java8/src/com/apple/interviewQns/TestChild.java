package com.apple.interviewQns;

public class TestChild extends TestAbstract {
	
	public TestChild() {
		// TODO Auto-generated constructor stub
	//	this();     Recursive constructor invocation is not possible.
		this(3,4);
		super.strAbstr = "234";
		System.out.println("default Constructor");
		
	}
	
	public TestChild(int x , int y) {
		//this();
	}
	
	
	
	public static void main(String args[]) {
		System.out.println("Main method ...");
		
		TestAbstract ta = new TestAbstract() {
			@Override
			public void add() {
				// TODO Auto-generated method stub
				super.add();
				System.out.println("From child...");
			}
			
		};
		
		//ta.add();
		
		TestChild testChild = new TestChild(3,4);
		//testChild.minusSum();
		
		
	}

}
