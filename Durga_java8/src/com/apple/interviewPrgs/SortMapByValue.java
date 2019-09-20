package com.apple.interviewPrgs;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByValue {
	
	public static void main(String[] args) throws Exception {
		 
		String str = "Hello how are you Hello what you are doing how you are doing";
		String[] strArr= str.split(" ");
		System.out.println(strArr);
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		for(int i = 0;i <= strArr.length - 1;i++){
			String s = strArr[i];
			if(treeMap.containsKey(s)){
				treeMap.put(s, treeMap.get(s)+1);
			}else{
				treeMap.put(s, 1);
			}
		}
		System.out.println(treeMap);
		Map<String, Integer> map = sortByValues(treeMap);
		for(Map.Entry<String, Integer> entryMap : map.entrySet()){
			System.out.println(entryMap.getKey()+ " - "+entryMap.getValue());
		}
	
	}
	
	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
		
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int compare = map.get(k2).compareTo(map.get(k1));
				if (compare == 0)
					return 1;
				else
					return compare;
			}
        };
        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
   }

}
