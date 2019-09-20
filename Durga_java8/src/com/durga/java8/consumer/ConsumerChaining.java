package com.durga.java8.consumer;

import java.util.function.Consumer;

public class ConsumerChaining {
	
	public static void main(String args[]) {
		
		Consumer<Movie> c1 = m -> System.out.println("Movie "+m.name+ " is going to release");
		Consumer<Movie> c2 = m -> System.out.println("Movie "+m.name+ " is just released");
		Consumer<Movie> c3 = m -> System.out.println("Movie "+m.name+ " information is storing in database");
		
		Consumer<Movie> chainedC = c1.andThen(c2).andThen(c3);
		
		Movie m1 = new Movie("Bahubali", "a1","b1");
		
		chainedC.accept(m1);
	}

}
