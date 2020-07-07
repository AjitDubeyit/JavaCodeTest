package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

public class FindNthToLast {

	static class Node{
		private int data;
		private Node next;
	}

	static Node pushNode(Node head, int value) {
		Node newNode = new Node();
		newNode.data = value;

		newNode.next = head;
		head = newNode;
		return head;
	}

	static Node nThToLast(Node head, int n) {
		Node curr=head;
		Node follower=head;
		for(int i=0;i<n;i++) {
			if(curr==null)
				return null;
			curr=curr.next;
		}
		while(curr!=null) {
			curr = curr.next;
			follower = follower.next;
		}
		
		return follower;
	}

	public static void main(String[] args) {
		Node head = null;
		head = pushNode(head, 10);
		head = pushNode(head, 20);
		head = pushNode(head, 30);
		
		Node print=head;
		while(print!=null) {
			
			System.out.println(print.data);
			print = print.next;
		}

		Node head1 = nThToLast(head,3);
		System.out.println("Nth Element is: "+head1.data);
	}
}
