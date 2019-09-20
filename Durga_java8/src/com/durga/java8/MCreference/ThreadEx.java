package com.durga.java8.MCreference;

public class ThreadEx {
	
	public void m1() {
		for(int i = 0;i<=10;i++) {
			System.out.println("child thread");
		}
	}
	
	public static void main(String args[]) {
		
		ThreadEx t = new ThreadEx();
		
		Runnable r =  t::m1;
		
		Thread thread = new Thread(r);
		thread.start();
		
		for(int i = 0;i<=10;i++) {
			System.out.println("main thread");
		}
	}

}
