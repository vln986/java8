package com.durga.common.sort.search;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left,right;
	
	Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}


class BinaryTree{
	Node root;
	
	void printLevelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.println(tempNode.data);
			
			if(tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if(tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}
}

public class BFSSearch {
	
	public static void main(String args[]) {
		BinaryTree treeLevel = new BinaryTree();
		treeLevel.root = new Node(1);
		treeLevel.root.left = new Node(2);
		treeLevel.root.right = new Node(3);
		treeLevel.root.left.left = new Node(4);
		treeLevel.root.left.right = new Node(5);
		
		System.out.println("Level order Or BFS : ");
		
		treeLevel.printLevelOrder();
	}

}
