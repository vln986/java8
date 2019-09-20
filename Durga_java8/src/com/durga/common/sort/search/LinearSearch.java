package com.durga.common.sort.search;

public class LinearSearch {
	
	public static void main(String args[]) {
		int arr[] = {22,34,33,44,21,43,23,56};
		int searchElement = 43;
		
		int indexLocation = linearSearch(arr, searchElement);
		System.out.println("IndexLocation : "+indexLocation);
		
		
	}

	 public static int linearSearch(int arr[], int x) {
		 
		 for(int i =0;i<=arr.length-1;i++) {
			 
			 if(arr[i] == x) {
				 return i;
			 }
				
			}
		 return -1;
	 }
}
