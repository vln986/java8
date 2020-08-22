package com.durga.interview.threads;

import java.util.LinkedList;

public class ProducerConsumerTest {
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity = 2;
	
	public void produce() throws InterruptedException{
		
		int value = 0;
		while(true) {
			synchronized (this) {
				while(list.size() == capacity)
				wait();
				System.out.println("Produced : "+value);
				list.add(value++);
				notify();
				Thread.sleep(1000);
				
			}
		}
	}
	public void consume() throws InterruptedException{
		while(true) {
			synchronized (this) {
				while(list.size()  == 0)
					wait();
					int x = list.removeFirst();
					System.out.println("Consumed : "+x);
					notify();
					Thread.sleep(1000);
				
				
			}
		}
	}

}
