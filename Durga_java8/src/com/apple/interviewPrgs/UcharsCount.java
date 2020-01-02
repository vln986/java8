package com.apple.interviewPrgs;

import java.util.HashMap;
import java.util.Map;

public class UcharsCount {
	
public static void main(String args[]) {
		
		String str = "Hey how are you"; 
		int count = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i =0;i<=str.length()-1;i++) {
			Character c = str.charAt(i);
			if(c != ' ' && map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				count--;
			}else if(c != ' ') {
				map.put(c,1);
				count++;
			}
		}
		
		map.forEach((k,v) -> System.out.println(k+ " = "+v));
		System.out.println("Unique chars : "+count);
	}

}
