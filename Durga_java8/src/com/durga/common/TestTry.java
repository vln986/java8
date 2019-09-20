package com.durga.common;

public class TestTry {
	
	public static void main(String args[]) {
		try {
			System.out.println(10/0);
			return;
		}catch(Exception e) {
			System.out.println("dd");
			return;
		}finally {
			System.out.println("finally");
			return;
		}
	}

}
