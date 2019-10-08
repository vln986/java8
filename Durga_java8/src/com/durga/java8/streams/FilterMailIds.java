package com.durga.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FilterMailIds {
	
	public static void main(String args[]) {
		
		Predicate<String> emailFilter = Pattern.compile("^(.+)@gmail.com$").asPredicate();
		
		List<String> emailIds = Arrays.asList("vln986@gmail.com","hr@cognizant.com","abc@cognizant.com","hr@hotmail.com","abc@gmail.com");
		
		List<String> gmailIds = emailIds.stream().filter(emailFilter).collect(Collectors.toList());
		
		gmailIds.forEach(System.out::println);
	}

}
