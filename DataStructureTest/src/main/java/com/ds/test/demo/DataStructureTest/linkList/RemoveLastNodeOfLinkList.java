package com.ds.test.demo.DataStructureTest.linkList;


public class RemoveLastNodeOfLinkList {

	static class Node{
		int data;
		Node next;
	}

	static Node push(Node head_ref, int new_data) {
		Node newNode = new Node();
		newNode.data=new_data;

		newNode.next=head_ref;
		head_ref = newNode;
		return newNode;
	}
	
	static Node deleteLastNode(Node head) {

		if(head==null) {
			return head;
		}
		Node last = head;
		Node previousToLastNode=null;
		while(last.next!=null) {
			previousToLastNode=last;
			last=last.next;
		}
		previousToLastNode.next=null;
		return last;
	}

	static Node deleteFirstNode(Node head) {
		if(head==null) {
			return head;
		}
		
		Node firstNode = head;
		head = head.next;
		firstNode.next = null;
		return firstNode;
		
		
	}
	
	public static void main(String[] args) {

		Node head = null;
		head = push(head, 10);
		head = push(head, 20);
		head = push(head, 30);
		head = push(head, 40);
		
		Node first = deleteFirstNode(head);
System.out.println(first.data);

		//Node last = deleteLastNode(head);
		//System.out.println(last.data);
		
		//System.out.println("Berfore");
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		



	}
}
