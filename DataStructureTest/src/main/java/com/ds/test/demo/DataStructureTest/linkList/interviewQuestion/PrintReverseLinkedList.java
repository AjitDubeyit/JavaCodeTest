package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

public class PrintReverseLinkedList {

	private class Node{
		private int value;
		private Node next;
	}
	
	private Node pushValueInLinkedList(Node head, int value) {
		Node newNode = new Node();
		newNode.value = value;
		
		newNode.next=head;
		head = newNode;
		return head;
	}
	
	private void printReversedList(Node head) {
		if(head==null) {
			return;
		}
		printReversedList(head.next);
		System.out.println(head.value);
	}
	
	public static void main(String[] args) {
		PrintReverseLinkedList printReverseLinkedList = new PrintReverseLinkedList();
		Node head = null;
		head = printReverseLinkedList.pushValueInLinkedList(head, 10);
		head = printReverseLinkedList.pushValueInLinkedList(head, 20);
		head = printReverseLinkedList.pushValueInLinkedList(head, 30);
		
		printReverseLinkedList.printReversedList(head);
		System.out.println("\n");
		while(head!=null) {
			System.out.println(head.value);
			head = head.next;
		}
		
		
	}
}
