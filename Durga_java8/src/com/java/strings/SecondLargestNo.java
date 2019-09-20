package com.java.strings;

public class SecondLargestNo {
	
	public static void main(String args[]) {
		
		int[] arr = {34,1,2,4,35,35,55,56,78,89,88,89};
		
		int first = arr[0];
		int second = arr[0];
		
		for(int i = 0;i<=arr.length-1;i++) {
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			}else if(arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		
		System.out.println("First Largest : "+first);
		System.out.println("Second Largest : "+second);
	}

}
