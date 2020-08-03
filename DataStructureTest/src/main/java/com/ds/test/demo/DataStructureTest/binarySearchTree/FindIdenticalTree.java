package com.ds.test.demo.DataStructureTest.binarySearchTree;
/*
 * Author: Ajit Dubey
 * 
 * Q>Check if two binary trees are identical or not?
 */
public class FindIdenticalTree {

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
	
	public static boolean identicalCheck(Node2 root1, Node2 root2) {
		if(root1==null && root2==null) return true;
		
		return (root1!=null && root2!=null) && (root1.value == root2.value) 
				&& identicalCheck(root1.left, root2.left) 
				&& identicalCheck(root1.right, root2.right);
	}

	public static void main(String[] args) {
		FindIdenticalTree tree = new FindIdenticalTree();
		Node2 root = null;
		root = tree.insertNode(root,20);
		root = tree.insertNode(root,10);
		root = tree.insertNode(root,30);
		tree.iterateBinaryTree(root);
		
		Node2 root1 = null;
		root1 = tree.insertNode(root1,20);
		root1 = tree.insertNode(root1,10);
		root1 = tree.insertNode(root1,30);
		System.out.println();
		tree.iterateBinaryTree(root1);
		
		boolean isIdentical = FindIdenticalTree.identicalCheck(root,root1);
		
		if(isIdentical) {
			System.out.println("Trees are identical!");
		} else {
			System.out.println("Trees are not identical!");
		}
	}
}

class Node2{
	int value;
	Node2 left,right;
}
