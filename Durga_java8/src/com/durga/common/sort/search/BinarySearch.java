package com.durga.common.sort.search;

public class BinarySearch {
	
	public static void main(String args[]) {
		int arr[] = {0,1,2,3,32,45,56};
		int number = 56;
		int result = binarySearch(arr, 56);
		
		System.out.println(number+ " found at index : "+result);
	}
	
	public static int binarySearch(int[] arr, int x) {
		int l =0, r = arr.length -1;
		
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
