package com.ds.test.demo.DataStructureTest.stack;

class Node1{
	int value;
	public Node1 left =null, right = null;
	
	public Node1(int value) {
		this.value = value;
	}
}

public class PrintAncestorOfNode {

	public static boolean printAncestor(Node1 root, int value) {
		
		if(root == null) {
			return false;
		}
		
		if(root.value == value) {
			return true;
		}
		//search node in left subtree
		boolean left = printAncestor(root.left, value);
		
		boolean right = false;
		if(!left) {
			right = printAncestor(root.right, value);
		}
		
		if(left || right) {
			System.out.println(root.value + " ");
		}
		
		return left || right;
	}
	
	public static void main(String[] args) {
		Node1 root= new Node1(10);
		root.left = new Node1(20);
		root.right = new Node1(30);
		root.left.right = new Node1(40);
		root.right.left = new Node1(50);
		root.right.right = new Node1(60);
		root.right.left.left = new Node1(70);
		root.right.right.right = new Node1(80);
		
		int node = 10;
		printAncestor(root,node);
	}	
}
