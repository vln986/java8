package com.java.programs.practice;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arr = {3,4,5,24,22,44,4,4};
		
		int index = linearSearch(arr,5);
		System.out.println("element found at index "+index);
		
	}
	public static int linearSearch(int[] arr, int x) {
		for(int i = 0;i<=arr.length -1;i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		
		return -1;
	}
}
