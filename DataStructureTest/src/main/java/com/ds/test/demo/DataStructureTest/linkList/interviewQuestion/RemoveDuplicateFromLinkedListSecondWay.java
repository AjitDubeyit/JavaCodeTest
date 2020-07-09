package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

import java.util.HashSet;

public class RemoveDuplicateFromLinkedListSecondWay {

	private class Node{
		private int value;
		private Node next;
	}
	
	private Node addNode(Node head, int value) {
		Node newNode = new Node();
		newNode.value = value;
		
		newNode.next = head;
		head=newNode;
		return head;
	}
	
	private void removeDuplicate(Node head) {
		if(head == null) return;
		HashSet<Integer> uniqueSet = new HashSet<Integer>(); 
		Node prev = null;
		
		while(head!=null) {
			if(uniqueSet.contains(head.value)) {
				prev.next = head.next;
			} else {
				uniqueSet.add(head.value);
				prev = head;
			}
			head = head.next;
		}
	}
	
	private void printLinkedList(Node head) {
		Node headRef = head;
		System.out.print("null");
		while(headRef!=null) {
			System.out.print(" <- " + headRef.value );
			headRef = headRef.next;
		}
	}
	
	public static void main(String[] args) {
		RemoveDuplicateFromLinkedListSecondWay ll = new RemoveDuplicateFromLinkedListSecondWay();
		Node head = null;
		head = ll.addNode(head, 10);
		head = ll.addNode(head, 60);
		head = ll.addNode(head, 30);
		head = ll.addNode(head, 30);
		head = ll.addNode(head, 30);
		head = ll.addNode(head, 40);
		head = ll.addNode(head, 50);
		ll.removeDuplicate(head);
		ll.printLinkedList(head);
	}
}
