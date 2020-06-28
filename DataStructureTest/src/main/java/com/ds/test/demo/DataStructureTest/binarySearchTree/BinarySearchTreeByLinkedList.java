package com.ds.test.demo.DataStructureTest.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeByLinkedList { 
	BinaryNode root;

	public BinaryNode getRoot() { 
		return root; 
	}

	public BinarySearchTreeByLinkedList(){ 
		root = null; 
	}

	public void insert(int value) {
		root = insert(root,value);
	}

	BinaryNode insert(BinaryNode currentNode, int value) { 
		if(currentNode == null) { 
			return createNewNode(value);
			//System.out.println("Successfully inserted " + value + " in BST"); 
		} else if(value<currentNode.getValue()) {
			currentNode.setLeft(insert(currentNode.getLeft(), value));
			return currentNode;
		} else {
			currentNode.setRight(insert(currentNode.getRight(), value));
			return currentNode;
		}
	}

	public BinaryNode createNewNode(int value) { 
		BinaryNode node = new BinaryNode(); 
		node.setValue(value); 
		return node; 
	}
	

	void printTreeGraphically() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		Queue<Integer> level = new LinkedList<Integer>();
		
		int CurrentLevel = 1;
		boolean previousLevelWasAllNull = false;
		queue.add(root);
		level.add(1);
		
		System.out.println("\nPrinting Level order traversal of Tree...");
		if(root == null) {
			System.out.println("Tree does not exists !");
			return;
		}
		
		while (!queue.isEmpty()) {
			if(CurrentLevel == level.peek()) { //if we are in the same level
				if(queue.peek()==null) {
					queue.add(null);level.add(CurrentLevel+1);
				}else {
					queue.add(queue.peek().getLeft());level.add(CurrentLevel+1);
					queue.add(queue.peek().getRight());level.add(CurrentLevel+1);
					previousLevelWasAllNull = false;
				}
				System.out.print(queue.remove() + "  ");level.remove();
			}else { //level has changed
				System.out.println("\n");
				CurrentLevel++;
				if(previousLevelWasAllNull == true) {
					break;
				}
				previousLevelWasAllNull = true;
			}
		}//end of loop
	}//end of method
	
	public static void main(String[] args) {
		BinarySearchTreeByLinkedList bst = new BinarySearchTreeByLinkedList();
		bst.insert(10);
		bst.insert(30);
		bst.insert(50);
		
		bst.printTreeGraphically();
	}
	
}
