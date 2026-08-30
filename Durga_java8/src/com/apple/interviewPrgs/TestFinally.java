package com.apple.interviewPrgs;

public class TestFinally {
	
	public static void main(String args[]) {
		int number = returnInteger();
		System.out.print("number = "+number);
	}
	@SuppressWarnings("finally")
	public static int returnInteger() {
		try {
			return 1;
		}catch(Exception e) {
			return 2;
		}finally {
			return 3;
		}
	}
}
