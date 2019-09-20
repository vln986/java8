package com.durga.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

import com.durga.java8.interf.Interf;

public class TestDefault implements Interf {
	
	public void m1() {
		System.out.println("Printing from implementation class...");
	}
	public static void m2() {
		System.out.println("printing from implementation class");
	}
	
	public static void main(String args[]) {
		TestDefault t = new TestDefault();
		t.m1();
		Interf.m2();
		Predicate<Integer> p = i -> i>10;
		System.out.println(p.test(90));
		Predicate<String> pStr = i -> i.length()>5;
		System.out.println(pStr.test("laxmi"));
		Predicate<Collection> pCol = i -> i.isEmpty();
		ArrayList<String> al = new ArrayList<String>();
		al.add("laxmi");
		System.out.println(pCol.test(al));
		}

}
