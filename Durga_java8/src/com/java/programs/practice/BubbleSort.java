package com.java.programs.practice;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,21,44,22,44,11,1,3,0,3,3};
		System.out.println("before sorting");
		Arrays.stream(arr).forEach(a -> System.out.print(a+", "));
		bubbleSort(arr);
		System.out.println("After sorting");
		System.out.println();
		Arrays.stream(arr).forEach(a -> System.out.print(a+", "));
	}
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0;i<n-1;i++) {
			for(int j = 0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
