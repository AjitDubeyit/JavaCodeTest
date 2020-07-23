package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

public class SplitALinkList {
	
	private class Node{
		private int value;
		private Node next;
	}
	
	private Node pushInLinkedList(Node head, int value) {
		Node newNode = new Node();
		newNode.value = value;
		
		newNode.next = head;
		head=newNode;
		return head;
	}
	
	private Node deviceLL(Node head) {
		if(head==null) return null;
		
		Node runner = head.next;
		
		while(runner!=null) {
			runner = runner.next;
			
			if(runner==null) {
				break;
			} else {
				runner = runner.next;
			}
			head = head.next;
		}
		Node returnList = head.next;
		head.next = null;
		
		return returnList;
	}
	

	public static void main(String[] args) {
		Node head = null;
		SplitALinkList splitall = new SplitALinkList();
		head = splitall.pushInLinkedList(head,10);
		head = splitall.pushInLinkedList(head,20);
		head = splitall.pushInLinkedList(head,30);
		head = splitall.pushInLinkedList(head,40);
		head = splitall.pushInLinkedList(head,50);
		head = splitall.pushInLinkedList(head,60);
		/*head = splitall.pushInLinkedList(head,70);
		head = splitall.pushInLinkedList(head,80);*/
		
		Node head1 = head;
		while(head1!=null) {
			System.out.println(head1.value);
			head1 = head1.next;
		}
		
		System.out.println();
		
		Node dividedNode = splitall.deviceLL(head);
		
		while(dividedNode!=null) {
			System.out.println(dividedNode.value);
			dividedNode = dividedNode.next;
		}
	}
	
	/*public Node deviceLL(Node list) {
		if(list == null) {
			return null;
		}
		
		Node runner = list.next;
		
		while(runner!=null) {
			runner = runner.next;
			
			if(runner==null) {
				break;
			} else {
				runner = runner.next;
			}
			list = list.next;
		}
		Node toReturn = list.next;
		list.next = null;
		return toReturn;
	}*/
}
