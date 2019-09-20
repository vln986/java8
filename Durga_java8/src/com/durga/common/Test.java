package com.durga.common;

import java.util.Scanner;
import java.util.function.Predicate;

import com.durga.entity.User;

public class Test {
	
	public static void main(String args[]){
		
		AbstractTest at = new AbstractTest() {
			
			void test(){
				System.out.println("from");
			}
		};
		at.test();
		System.out.println("hello world...");
		Predicate<User> p = u -> u.userName.equals("durga") && u.password.equals("Java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter UserName :");
		String userName = sc.nextLine();
		System.out.println("Please enter password :");
		String password = sc.nextLine();
		User user = new User(userName, password);
		if(user.userName.equals("durga") && user.password.equals("java")){
			System.out.println("Successfully logged in..Welcome "+userName);
		}else{
			System.out.println("Invalid Username or Password ");
		}
	}

}
