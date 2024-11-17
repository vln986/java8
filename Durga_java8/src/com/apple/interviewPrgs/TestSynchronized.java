package com.apple.interviewPrgs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSynchronized {
	public static void main(String args[]) {
		
		System.out.println("1 ");
		synchronized(args) {
			System.out.println("2 ");
			try {
				args.wait();
			}catch(InterruptedException e) {
				
			}
			System.out.println("3 ");
		}
	}

}
