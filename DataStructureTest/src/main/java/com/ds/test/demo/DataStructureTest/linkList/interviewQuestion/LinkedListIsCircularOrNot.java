package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

public class LinkedListIsCircularOrNot {

	private class Node{
		private int value;
		private Node next;
	}

	private Node addNodeInLinkedList(int value, Node head) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	private boolean isCircular(Node head) {

		if(head == null) return true;

		Node node = head.next;

		while(node!=null && node!=head)
			node = node.next;

		if(node==head) {
			return true;
		} else {
			return false;
		} 
	}
	
	private void iterateCircularLL(Node head) {
		if(head==null) {
			return;
		}
		
		Node node = head.next;
		while(head!=node) {
			System.out.print(node.value+" ");
			node = node.next;
		}
		
	}
	

	public static void main(String[] args) {
		LinkedListIsCircularOrNot circularLinkedList = new LinkedListIsCircularOrNot();

		Node head = null;
		head = circularLinkedList.addNodeInLinkedList(10,head);
		head = circularLinkedList.addNodeInLinkedList(20,head);
		head = circularLinkedList.addNodeInLinkedList(30,head);
		head = circularLinkedList.addNodeInLinkedList(40,head);
		
		head.next.next.next.next = head;

		System.out.println("is Linked List is circular: " + circularLinkedList.isCircular(head));
		
		circularLinkedList.iterateCircularLL(head);
	}

	
}
