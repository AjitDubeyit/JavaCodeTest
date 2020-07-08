package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

public class LinkedListIsCircularOrNot {
	
	private class Node{
		private int value;
		private Node next;
	}
	
	private Node addNodeInLinkedList(int value, Node head) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = null;
		/*newNode.next = head;
		head = newNode;*/
		return head;
	}

	public static void main(String[] args) {
		LinkedListIsCircularOrNot circularLinkedList = new LinkedListIsCircularOrNot();
		
		Node head = null;
		head = circularLinkedList.addNodeInLinkedList(10,head);
		head.next = circularLinkedList.addNodeInLinkedList(20,head);
		head.next.next = circularLinkedList.addNodeInLinkedList(30,head);
		head.next.next.next = circularLinkedList.addNodeInLinkedList(40,head);
		
		while(head!=null) {
			System.out.println(head.value);
			head = head.next;
		}
		
		//System.out.println("is Linked List is circular: " + circularLinkedList.isCircular(head));
		head.next.next.next.next = head;
		
		System.out.println("is Linked List is circular: " + circularLinkedList.isCircular(head));
		
		
	}
	
	private boolean isCircular(Node head) {
		
		if(head == null) return true;
		
		Node node = head.next;
		
		while(node!=null && node!=head) {
			node = node.next;
			
			if(node==head) 
				return true;
			return false;
		}
		return false;
	}
}
