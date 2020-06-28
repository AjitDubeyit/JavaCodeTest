package com.ds.test.demo.DataStructureTest.stack;

class Node{
	int data;
	Node next;
}
public class StackByLinkedList {

	private Node top;
	
	public StackByLinkedList() {
		this.top=null;
	}
	
	@SuppressWarnings("unused")
	public void push(int x) {
		Node node = new Node();
		
		if(node==null) {
			System.out.println("Heap overflow");
			return;
		}
		
		System.out.println("Inserting " + x);
		
		node.data=x;
		node.next=top;
		top=node;
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is Empty!");
			return -1;
		}
	}
	
	public void pop() {
		if(top==null) {
			System.out.println("Stack is empty!");
		} 
		
		System.out.println("Removing " + peek());
		//update top pointer to point to the next node
		top = top.next;
	}
	
	public static void main(String[] args) {
		StackByLinkedList stackByLinkList = new StackByLinkedList();
		System.out.println("Stack push operation!");
		stackByLinkList.push(10);
		stackByLinkList.push(20);
		stackByLinkList.push(30);
		
		System.out.println("Stack Peek Operation!");
		System.out.println(stackByLinkList.peek());
		
		System.out.println("Stack pop operation!");
		stackByLinkList.pop();
	}
}
