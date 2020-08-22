package com.java.strings;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatableChar2 {
	
	public static void main(String args[]) {
		
		String str = "abbccddf";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i =0;i<=str.length()-1;i++) {
			char c = str.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println("Non repeatable chars in String "+str);
		map.forEach((key,value) -> {
			if(value == 1) {
				System.out.println(key);
			}
		});
	}

}
