package com.apple.interviewPrgs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStatic {
	public static void main(String args[]) {
		
		Tenor t = new Tenor();
		Singer s = new Singer();
		System.out.println(t.sing()+" "+s.sing());
	}
	public static String sing() {
		return"fa";
	}
	public class Singer{
		public static String sing() {
			return "la";
		}
	}
}

