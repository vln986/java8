package com.apple.interviewPrgs;

import java.util.HashMap;
import java.util.Map;

public class DisplayHashMap {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("A", "A for Apple");
		map.put("B", "B for Bat");
		map.put("C", "C for Cognizant");
		
		for(Map.Entry<String, String> entryMap : map.entrySet()) {
			System.out.println("Key : " +entryMap.getKey()+ " Value : "+entryMap.getValue());
		}
		
		//using java8
		System.out.println("Using java8");
		map.forEach((k,v) -> System.out.println("Key : "+k+" value : "+v));
	}

}
