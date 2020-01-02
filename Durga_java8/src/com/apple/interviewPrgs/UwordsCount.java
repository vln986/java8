package com.apple.interviewPrgs;

import java.util.HashMap;
import java.util.Map;

public class UwordsCount {
	public static void main(String args[]) {
		
		String str = "Hey how are you how do you do"; 
		String[] strArr = str.split(" ");
		int count = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i =0;i<=strArr.length-1;i++) {
			String s = strArr[i];
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
				count--;
			}else {
				map.put(s,1);
				count++;
			}
		}
		
		map.forEach((k,v) -> System.out.println(k+ " = "+v));
		System.out.println("Unique words : "+count);
	}

}
