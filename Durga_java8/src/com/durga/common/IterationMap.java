package com.durga.common;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IterationMap {
	
	public static void main(String[] arg) 
    { 
        Map<String,String> gfg = new HashMap<String,String>(); 
      
        // enter name/url pair 
        gfg.put("GFG", "geeksforgeeks.org"); 
        gfg.put("Practice", "practice.geeksforgeeks.org"); 
        gfg.put("Code", "code.geeksforgeeks.org"); 
        gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
        
        for(Map.Entry<String, String> entryMap : gfg.entrySet()){
        	System.out.println("Key : "+entryMap.getKey()+ " Value : "+entryMap.getValue());
        }
        // in Java 8
        gfg.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));
        
        // sorting map by key in java 8
        
        gfg.entrySet().stream().sorted(Map.Entry.comparingByKey())
         .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
        		 (oldvalue, newvalue) -> oldvalue, LinkedHashMap:: new));
    }

}
