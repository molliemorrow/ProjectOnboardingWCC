package com.revature.main;

import com.revature.models.BinaryTree;
import com.revature.models.Node;

public class Driver {
	
	public static void main(String [] args) {
		Node root = new Node(4);
		BinaryTree bt = new BinaryTree(root);
		
		bt.add(3);
		bt.add(11);
		bt.add(2);
		bt.add(8);
		bt.add(22);
		bt.add(1);
		bt.add(7);
		
		bt.printLevelOrderTraversal();
		
	}
}
