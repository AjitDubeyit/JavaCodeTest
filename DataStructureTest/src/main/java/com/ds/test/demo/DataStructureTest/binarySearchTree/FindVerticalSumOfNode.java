package com.ds.test.demo.DataStructureTest.binarySearchTree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
/*
 				10
			 5		20
		   3   7,		30
		
Pre-Order(VLR) - 10,5,3,7,20,30
 
Vertical sum of Node: [3, 5, 10]

Level order traversal: 10 5 20 3 7 30 
 
*/
public class FindVerticalSumOfNode {

	public Node1 insertNodeInBTree(Node1 root, int value) {
		
		if(root == null) {
			root = createNewNode(value);
			return root;
		} else if(value<root.value) {
			
			root.left = insertNodeInBTree(root.left, value);
		} else {
			root.right = insertNodeInBTree(root.right, value);
		}
		
		return root;
	}
	
	private Node1 createNewNode(int value) {
		Node1 newNode = new Node1();
		newNode.value = value;
		return newNode;
	}
	
	public void iterateLevelOrder(Node1 root) {
		if(root == null) return;
		Queue<Node1> queue = new LinkedList<Node1>();
		queue.add(root);
		System.out.print("\nLevel order traversal: ");
		while(!queue.isEmpty()) {
			Node1 node = queue.remove();
			System.out.print(node.value+ " ");
			if(node.left!=null) queue.add(node.left);
			if(node.right!=null) queue.add(node.right);
		}
	}
	
	public void iterateBFSOrder(Node1 root) {
		if(root == null) return;
		System.out.print(root.value + " ");
		iterateBFSOrder(root.left);
		iterateBFSOrder(root.right);
	}
	
	public void getVerticalSum(Node1 root) {
		if(root == null) return;
		
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		
		verticalSum(root, 0, treeMap);
		
		if(treeMap!=null) {
			System.out.println("Vertical sum of Node: " + treeMap.values());
		}
	}
	
	private void verticalSum(Node1 root, int d, Map<Integer, Integer> treeMap) {
		if(root == null) return;
		verticalSum(root.left, d-1, treeMap);
		int sum = (treeMap.get(d) == null) ? 0 : treeMap.get(d);
		treeMap.put(d, sum + root.value);
	}

	public static void main(String[] args) {
		FindVerticalSumOfNode verticalSum = new FindVerticalSumOfNode();
		Node1 root = null;
		root = verticalSum.insertNodeInBTree(root, 10);
		root = verticalSum.insertNodeInBTree(root, 20);
		root = verticalSum.insertNodeInBTree(root, 5);
		root = verticalSum.insertNodeInBTree(root, 30);
		root = verticalSum.insertNodeInBTree(root, 7);
		root = verticalSum.insertNodeInBTree(root, 3);
		
		verticalSum.getVerticalSum(root);
		verticalSum.iterateBFSOrder(root);
		verticalSum.iterateLevelOrder(root);
		
		
		
	}
	
}

class Node1{
	Node1 left;
	Node1 right;
	int value;
}