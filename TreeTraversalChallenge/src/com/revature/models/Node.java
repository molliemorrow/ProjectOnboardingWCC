package com.revature.models;

public class Node {

	private int value;
	private Node left;
	private Node right;
	
	public Node(int value) {
		super();
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public Node(int value, Node left, Node right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	public void add(int v) {
		if(this.value > v) {
			if(this.left == null) {
				this.left = new Node(v);
			}
			else {
				this.left.add(v);
			}
		}
		else {
			if(this.right == null) {
				this.right = new Node(v);
			}
			else{
				this.right.add(v);
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		result = prime * result + value;
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
		Node other = (Node) obj;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String leftStr = (this.left == null) ? null : this.left.toString();
		String rightStr = (this.right == null) ? null : this.right.toString();
		return "(" + leftStr + " / " + value  + " \\ " + rightStr + ")";
	}
	
	
	
}
