package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

public class TailInsertDelete {

	private class Node{
		Node next;
		int data;
	}

	private Node insertNode(Node head, int value) {
		Node newNode = new Node();
		newNode.data = value;
		
		newNode.next=head;
		head=newNode;
		return head;
	}
	// -----Insert And delete at tail------------------

	//   Head-> 30->20->10 <-Tail
	private void nodeInsertAtTail(Node head, int value) {
		Node tempNode = head;
		if(tempNode!=null) {
			Node newNode = new Node();
			newNode.data = value;

			while(tempNode.next!=null) {
				tempNode = tempNode.next;
			}
			tempNode.next=newNode;
		}
	}

	private Node deleteFromTail(Node head) {
		Node tempNode = head;
		if(tempNode!=null) {
			
			while(tempNode.next.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = null;
		}
		return head;
	}
	//---------------------------------------------
	
	public static void main(String[] args) {
		TailInsertDelete tailInsertDelete = new TailInsertDelete();
		Node head = null;
		head = tailInsertDelete.insertNode(head, 10);
		head = tailInsertDelete.insertNode(head, 20);
		head = tailInsertDelete.insertNode(head, 30);
		
		//head = tailInsertDelete.nodeInsertAtTail(head,60);
		
		//tailInsertDelete.deleteFromTail(head);
		
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}

}
