package com.durga.common.sort.search;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String args[]) {
		int[] arr = {45,34,2,3,45,44,44,34,34,56};
		
		System.out.println("before sorting : ");
		
		Arrays.stream(arr).forEach(a -> System.out.print(a+ " "));
		bubbleSort(arr);
		System.out.println();
		for(int i = 0; i<= arr.length-1;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i< n -1;i++) {
			for(int j = 0; j < n-i-1;j++) {
				if(arr[j] > arr[j+1]) {     // sorts the array in ascending order
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
