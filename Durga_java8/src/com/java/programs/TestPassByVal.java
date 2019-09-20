package com.java.programs;

public class TestPassByVal {
	
	public static void main(String[] args){ 
        int x = 5; 
        change(x); 
        System.out.println(x); 
    } 
    public static void change(int x) { 
        x = 10; 
    } 

}
