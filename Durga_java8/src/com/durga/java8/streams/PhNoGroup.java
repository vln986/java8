package com.durga.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhNoGroup {
	
	public static void main(String args[]) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("919876543210");
		list.add("919876543210");
		list.add("469876543210");
		list.add("469876543210");
		list.add("139876543210");
		list.add("139876543210");
		list.add("469876543210");
		list.add("529876543210");
		list.add("529876543210");
		
		Map<String, List<String>> list2 = list.stream().collect(Collectors.groupingBy(s -> s.substring(0,3),Collectors.toList()));
		System.out.println(list2);
	
	}

}
