package com.durga.common.sort.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestLinkedList {
	
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		System.out.println("List = "+list);
		list.add(2, 3);
		System.out.println("List after insertion at index "+list);
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(2);
		 
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(3);
	}

}
