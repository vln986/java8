package com.apple.interviewPrgs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountStream {
	
	public static void main(String args[]) {
		
		List<String> words = Arrays.asList("Laxminarayana", "Bharati");
		
		Map<Character, Long> charFrequency = words.stream() //Stream<String>
		        .flatMap(a -> a.chars().mapToObj(c -> (char) c)) // Stream<Character>
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		charFrequency.forEach((k,v) -> System.out.println("Letter : "+k+ " Count : "+v));
	}

}
