package com.durga.java8.consumer;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class IntConsumerEx {
	
	public static void main(String args[]) {
		
		IntConsumer ic = i -> System.out.println(i*i);
		ic.accept(5);
		
		DoubleConsumer dc = i -> System.out.println(i*i);
		dc.accept(5);
	}

}
