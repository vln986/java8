package com.durga.java8;

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
		System.out.println("done");
	}

}
