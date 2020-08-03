package com.ds.test.demo.DataStructureTest.binarySearchTree;

public class SpiralOrderTraversalOfBinaryTree {
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
	
	public static boolean printLevelLeftToRight(Node2 root, int level) {
		if(root == null) return false;
		
		if(level == 1) {
			System.out.println(root.value + " ");
			return true;
		}
		boolean left = printLevelLeftToRight(root.left,level-1);
		boolean right = printLevelLeftToRight(root.right, level-1);
		return left||right;
	}
	
	public static boolean printRightToLeft(Node2 root, int level) {
		if(root == null) return false;
		
		if(level == 1) {
			System.out.println(root.value + " ");
			return true;
		}
		
		boolean right = printRightToLeft(root.right, level-1);
		boolean left = printRightToLeft(root.left, level-1);
		
		return right||left;
	}
	
	public static void printSpiralOrder(Node2 root) {
		if(root==null) return;
		
		int level = 1;
		
		while(printLevelLeftToRight(root, level++) && printRightToLeft(root, level++));
		
	}
	
	public static void main(String[] args) {
		SpiralOrderTraversalOfBinaryTree tree = new SpiralOrderTraversalOfBinaryTree();
		Node2 root = null;
		root = tree.insertNode(root,20);
		root = tree.insertNode(root,10);
		root = tree.insertNode(root,30);
		root = tree.insertNode(root,5);
		root = tree.insertNode(root,15);
		root = tree.insertNode(root,25);
		root = tree.insertNode(root,35);
		//tree.iterateBinaryTree(root);
		
		printSpiralOrder(root);
	}
}
