package com.revature.models;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	private Node root;
	
	public BinaryTree(Node root) {
		super();
		this.root = root;
	}
	
	public void add(int value) {
		this.root.add(value);
	}
	
	public void printLevelOrderTraversal() {
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(this.root);
		while(!q.isEmpty()) {
			Node n = q.poll();
			if(n != null) {
				System.out.println(n.getValue());
				q.add(n.getLeft());
				q.add(n.getRight());
			}
		}
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((root == null) ? 0 : root.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BinaryTree other = (BinaryTree) obj;
		if (root == null) {
			if (other.root != null)
				return false;
		} else if (!root.equals(other.root))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BinaryTree [root=" + root + "]";
	}
	
	

}
