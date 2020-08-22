package com.durga.common;

import com.durga.java8.interf.Left;
import com.durga.java8.interf.Right;

public class TestMultipleImpl implements Left, Right{
	
	public void m1() {
		System.out.println("printing from implementation class...");
		Left.super.m1();
		Right.super.m1();
	}
	public static void main(String args[]) {
		TestMultipleImpl t = new TestMultipleImpl();
		t.m1();
		Left.m2();
		Left l = new Left() {
			public void m1() {
				
			}

			public void m2() {
				// TODO Auto-generated method stub
				
			}
		};
		System.out.println("done");
	}
	public void m2() {
		// TODO Auto-generated method stub
		
	}

}
