package com.java.programs.practice;

public class BinarySearch {
	
	public static void main(String args[]) {
		int[] arr = {3,4,5,33,2,22,45,55};
		int x = 55;
		
		int index = binarySearch(arr, 5);
		System.out.println("element found at index "+index);
	}
	
	public static int binarySearch(int[] arr, int x) {
		
		int l = 0, r = arr.length-1;
		
		while(l<=r) {
			
			int m = l + (r -l)/2;
			
		//.out.println(m);
			
			if(arr[m] == x) 
				return m;
			
			if(arr[m] < x) 
				l = m +1;
			else 
				r = m -1;
			
		}
		return -1;
	}

}
