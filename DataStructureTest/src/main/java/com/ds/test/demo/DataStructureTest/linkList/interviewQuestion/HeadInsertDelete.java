package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

public class HeadInsertDelete {

	private class Node{
		Node next;
		int data;
	}

	public Node insert(Node head, int value) {
		Node newNode = new Node();
		newNode.data = value;

		newNode.next = head;
		head=newNode;
		return head;
	}

	//--------Insert delete at head-------------
	private Node deleteFromHead(Node head) {
		if(head!=null) {
			Node tempNode = head;
			tempNode=head.next;
			head = tempNode;

		}
		return head;
	}

	private Node insertAtHead(Node head, int value) {
		if(head!=null) {
			Node newNode = new Node();
			newNode.data = value;

			newNode.next = head;
			head = newNode;
		}
		return head;
	}
	//-------------------------------------------------
	
	public static void main(String[] args) {
		Node head = null;
		HeadInsertDelete insertNode = new HeadInsertDelete();
		head = insertNode.insert(head, 10);
		head = insertNode.insert(head, 20);
		head = insertNode.insert(head, 30);

		//head = insertNode.deleteFromHead(head);

		//head  = insertNode.insertAtHead(head,40);

		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
