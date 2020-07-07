package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;


public class NthInsertDelete {

	private class Node{
		private int data;
		private Node next;
	}
	
	private Node insertNode(Node head, int value) {
		Node newNode = new Node();
		newNode.data=value;
		
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	private void nThInsert(int value, int n, Node head) {
		Node curr = head;
		Node follwer = head;
		Node newNode = new Node();
		newNode.data = value;
		
		for(int i=0; i<n; i++) {
			if(curr==null) 
				throw new NullPointerException();
			curr = curr.next;
		}
		
		while(curr!=null) {
			curr = curr.next;
			follwer = follwer.next;
		}
		System.out.print("Inserting in between "+ follwer.data);
		Node previousNode = follwer;
		Node nextNode = follwer.next;
		previousNode.next = newNode;
		newNode.next = nextNode; 
		System.out.println(" and " + nextNode.data);
		
	}
	
	private void deleteFromLastNth(int n, Node head) {
		Node curr = head;
		Node follower = head;
		
		for(int i=0; i<=n; i++) {
			curr = curr.next;
		}
		
		while(curr!=null) {
			curr = curr.next;
			follower = follower.next;
		}
		
		Node presentNode = follower;
		Node nextNode = follower.next.next;
		presentNode.next=nextNode;
	}
	
	public static void main(String[] args) {
		NthInsertDelete nthInsertDelete = new NthInsertDelete();
		Node head = null;
		head = nthInsertDelete.insertNode(head, 10);
		head = nthInsertDelete.insertNode(head, 20);
		head = nthInsertDelete.insertNode(head, 30);
		head = nthInsertDelete.insertNode(head, 40);
		head = nthInsertDelete.insertNode(head, 50);
		//nthInsertDelete.nThInsert(100,3,head);

		Node node = head;
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		
		nthInsertDelete.deleteFromLastNth(1,head);
		System.out.println("Link List after deleting!");
		
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		
		
	}
}
