package com.java.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Anagrams {
	
	public static void main(String args[]) {
		
		String[] strArr = {"xyz","yzx","zxy","abcd","bcda","cdab","dabc","pqr","qrp","rpq","tea","eat"};
		
	//	List<String> strList = Arrays.asList(strArr);
		
	//	Map<String, List<String>> sortedList = strList.stream().collect(Collectors.groupingBy(s -> sorted(s)));
		
		Map<String, List<String>> sortedArr = Arrays.stream(strArr).collect(Collectors.groupingBy(s -> sorted(s)));
		
		System.out.println(sortedArr);
		
		Set<String> uniqueStr = sortedArr.keySet();
		
		System.out.println(uniqueStr); 
		
	
	}
	
	public static String sorted(String str) {
		
		char[] arr = str.toLowerCase().toCharArray();
		Arrays.sort(arr);
		
		return new String(arr);
	}

}

