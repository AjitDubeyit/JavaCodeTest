package com.ds.test.demo.DataStructureTest.binarySearchTree;

public class HeightOfBinaryTree {
	public Node2 insertNode(Node2 root, int value) {
		if(root==null) {
			Node2 newNode = new Node2();
			newNode.value = value;
			return newNode;
		} else if(value>root.value) {
			root.right = insertNode(root.right,value);
		} else {
			root.left = insertNode(root.left, value);
		}
		return root;
	}
	
	public void iterateBinaryTree(Node2 root) {
		if(root==null) return;
		System.out.println(root.value);
		iterateBinaryTree(root.left);
		iterateBinaryTree(root.right);
	}
	
	public static int heghtOfBTree(Node2 root) {
		if(root == null) return 0;
		
		int left = heghtOfBTree(root.left);
		int right = heghtOfBTree(root.right);
		if(left>right) {
			return 1+left;
		} return 1+right;
		
		//return 1+Math.max(left, right);
		
	}
	
	public static void main(String[] args) {
		HeightOfBinaryTree tree = new HeightOfBinaryTree();
		Node2 root = null;
		root = tree.insertNode(root,20);
		root = tree.insertNode(root,10);
		root = tree.insertNode(root,30);
		//tree.iterateBinaryTree(root);
		int height = HeightOfBinaryTree.heghtOfBTree(root);
		System.out.println("Height of binary tree: " + height);
	}
}
