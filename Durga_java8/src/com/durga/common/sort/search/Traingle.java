package com.durga.common.sort.search;

import java.util.Scanner;

public class Traingle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Number : ");
		
		int number = sc.nextInt();
		int k = 1;
		
		for(int i =0;i<number;i++) {
			if(i % 2 == 0) {
				for(int j = 0;j<=i;j++) {
					System.out.print(k);
					k++;
				}
			}else {
				for(int j = i;j>=0;j--) {
					++k;
					System.out.print(k);
					
				}
			}
			System.out.println();
		}
	}

}
