package com.ds.test.demo.DataStructureTest.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeByLinkedList { 

	public static Node root;

	public void insert(int value) {
		root = insert(root, value);
	}

	public Node insert(Node currNode, int value) {
		if(currNode==null) {
			Node newNode = new Node();
			newNode.value = value;
			return newNode;
		} else if(value<currNode.value) {
			currNode.left=insert(currNode.left,value);
		} else {
			currNode.right = insert(currNode.right,value);
		}
		return currNode;
	}

	public Node createNewNode(int value) { 
		Node node = new Node(); 
		node.value = value; 
		return node; 
	}

	private void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.println(root.value);
		inOrder(root.right);
	}

	private void postOrder(Node root) {
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.value);
	}

	private void preOrder(Node root) {
		if(root == null) return;
		System.out.println(root.value);
		preOrder(root.left);
		preOrder(root.right);
	}

	private void levelOrderTraverse(Node root) {
		if(root == null) return;
		Queue<Node> toVisited = new LinkedList<Node>();
		toVisited.add(root);
		while(!toVisited.isEmpty()) {
			Node curr = toVisited.remove();
			System.out.println(curr.value);
			if(curr.left!=null) toVisited.add(curr.left);
			if(curr.right!=null) toVisited.add(curr.right);
		}
	}

	private void searchNodeInBinaryTree(int value, Node root) {
		if(root == null) return;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.remove();
			if(node.value == value) {
				System.out.println("Value is found " +value);
				return;
			} else {
				if(node.left!=null) queue.add(node.left);
				if(node.right!=null) queue.add(node.right);
			}
		}
	}

	public boolean printAncestorOfNode(Node root, int value) {
		if(root==null) {
			return false;
		}

		if(root.value == value) {
			return true;
		}

		boolean left = printAncestorOfNode(root.left, value);

		boolean right = false;

		if(!left) {
			right = printAncestorOfNode(root.right, value);
		}

		if(left || right) {
			System.out.print(root.value + " ");
		}
		return (left||right);
	}

	//print height of tree
	public int printMaxHeightOfTree(Node root) {
		if(root==null) {
			return 0;
		} else {
			int leftHeight = printMaxHeightOfTree(root.left);
			int rightHeight = printMaxHeightOfTree(root.right);

			if(leftHeight>rightHeight){
				return leftHeight+1;
			} else {
				return rightHeight+1;
			}
		}
	}
	public void deleteDeepestNode(Node root) {

	}

	public static void main(String[] args) {
		BinarySearchTreeByLinkedList bst = new BinarySearchTreeByLinkedList();

		Node root = null;
		root = bst.insert(root,10);
		root = bst.insert(root,5);
		root = bst.insert(root,50);
		root = bst.insert(root,60);
		root = bst.insert(root,70);
		root = bst.insert(root,7);
		root = bst.insert(root,3);

		//Breath First Search (BFS)
		//bst.levelOrderTraverse(root);

		//Depth First Search (DFS)
		//bst.inOrder(root);
		//bst.preOrder(root);
		//bst.postOrder(root);
		//bst.searchNodeInBinaryTree(70, root);

		//bst.printAncestorOfNode(root, 70);
		int height = bst.printMaxHeightOfTree(root);
		System.out.println("Height of tree: " + height);
	}
}

class Node{
	int value;
	Node left;
	Node right;
}
