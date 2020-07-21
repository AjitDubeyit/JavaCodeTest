package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

public class RemoveDuplicateFromLinkedListFirstWay {

	private class Node{
		private int value;
		private Node next;
	}
	
	private Node addNodeInLinkedList(Node head, int value) {
		Node newNode = new Node();
		newNode.value=value;
		
		newNode.next = head;
		head=newNode;
		return head;
	}
	
	private void removeDuplicateNodeFromLL(Node head) {
		while(head!=null) {
			Node curr = head;//get first node of linked list
			while(curr.next!=null) {
				if(curr.next.value==head.value) {
					curr.next = curr.next.next;
				} else {
					curr=curr.next;
				}
			}
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		RemoveDuplicateFromLinkedListFirstWay ll = new RemoveDuplicateFromLinkedListFirstWay();
		Node head = null;
		head = ll.addNodeInLinkedList(head, 10);
		head = ll.addNodeInLinkedList(head, 20);
		head = ll.addNodeInLinkedList(head, 40);
		head = ll.addNodeInLinkedList(head, 50);
		head = ll.addNodeInLinkedList(head, 10);
		
		ll.removeDuplicateNodeFromLL(head);
		
		while(head!=null) {
			System.out.println(head.value);
			head = head.next;
		}
	}
}
