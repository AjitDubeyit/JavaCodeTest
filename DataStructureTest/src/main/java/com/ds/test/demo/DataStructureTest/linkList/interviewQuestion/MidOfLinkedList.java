package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

// Ellie mie 
// Find mid of linked List 
/*
 * Author: Ajit Dubey
 */
public class MidOfLinkedList {
	
	public static Node2 createLinkedList(Node2 head, int value) {
		Node2 newNode = new Node2();
		newNode.value = value;
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	public static void findMidOfLinkedList(Node2 head) {
		if(head == null) return;
		Node2 runner = head;
		head = head.next;
		
		while(head!= null) {
			head = head.next;
			if(head!=null) {
				head = head.next;
				runner = runner.next;
			}
			
		}
		System.out.println("Mid of Linked list: " + runner.value);
	}
	
	
	
	public static void main(String[] args) {
		Node2 head = null;
		head  = MidOfLinkedList.createLinkedList(head, 10);
		head  = MidOfLinkedList.createLinkedList(head, 20);
		head  = MidOfLinkedList.createLinkedList(head, 30);
		head  = MidOfLinkedList.createLinkedList(head, 40);
		head  = MidOfLinkedList.createLinkedList(head, 50);
		head  = MidOfLinkedList.createLinkedList(head, 60);
		head  = MidOfLinkedList.createLinkedList(head, 70);
		MidOfLinkedList.findMidOfLinkedList(head);
	}
}

class Node2{
	Node2 next;
	int value;
}
