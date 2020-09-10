package com.apple.interviewPrgs;

import java.util.Arrays;

public class PrintPyramid {

	public static void main(String args[]) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		int[] arr = { 3, 4, 33, 3, 5 };
		Arrays.sort(arr);

		Arrays.stream(arr).forEach(s -> System.out.print(s + " "));

	}

}
