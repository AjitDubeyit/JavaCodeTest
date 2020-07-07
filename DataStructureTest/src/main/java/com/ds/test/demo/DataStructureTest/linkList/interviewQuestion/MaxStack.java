package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

public class MaxStack {

	private class Node{
		private int value;
		private Node next;
		private Node oldMax;
	}
	
	private Node max;
	private Node stack;
	
	public MaxStack() {
	}
	
	public void push(int x) {
		Node newNode = new Node();
		newNode.value = x;
		
		if(stack==null) {
			stack = newNode;
		} else {
			newNode.next = stack;
			stack = newNode;
		}
		
		if(max==null || newNode.value > max.value) {
			newNode.oldMax=max;
			max=newNode;
		}
	}
	
	public int pop() {
		if(stack==null) throw new NullPointerException();
		Node n = stack;
		stack=n.next;
		if(n.oldMax!=null) max=n.oldMax;
		return n.value;
	}
	
	public int max() {
		if(max==null) throw new NullPointerException();
		return max.value;
	}
	
	public static void main(String[] args) {
		MaxStack maxStack = new MaxStack();
		maxStack.push(10);
		maxStack.push(20);
		maxStack.push(30);
		maxStack.push(5);
		maxStack.push(15);
		maxStack.push(25);
		maxStack.push(35);
		maxStack.push(25);
		
		int pop = maxStack.pop();
		//System.out.println(pop);
		Node max = maxStack.max;
		System.out.println("Max stack is : " + max.value);
	}
}

