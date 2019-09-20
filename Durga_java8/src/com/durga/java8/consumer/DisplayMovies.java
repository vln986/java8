package com.durga.java8.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class DisplayMovies {
	
	public static void main(String args[]) {
		
		ArrayList<Movie> al = new ArrayList<Movie>();
		
		populateMovies(al);
		
		Consumer<Movie> c = m ->{
			System.out.println("Movie Name : "+m.name);
			System.out.println("hero "+m.hero);
			System.out.println("heroine " +m.heroine);
		};
		
		for(Movie m : al) {
			c.accept(m);
			System.out.println("--------------");
		}
		
		
	}
	public static void populateMovies(ArrayList<Movie> movies) {
		
		movies.add(new Movie("A", "a1", "b1"));
		movies.add(new Movie("B", "a1", "b1"));
		movies.add(new Movie("C", "a1", "b1"));
		movies.add(new Movie("D", "a1", "b1"));
		movies.add(new Movie("E", "a1", "b1"));
		movies.add(new Movie("F", "a1", "b1"));
		movies.add(new Movie("G", "a1", "b1"));
		movies.add(new Movie("H", "a1", "b1"));
	}

}
