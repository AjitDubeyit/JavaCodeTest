package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

import java.util.HashSet;
import java.util.Set;

public class FindLoopInLinkedList {

	public static Node createLinkedList(Node head, int value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	public static void findLoopInLL(Node head) {
		if(head == null) return;
		
		Set<Node> nodeSet = new HashSet<Node>();
		nodeSet.add(head);
		while(head!=null) {
			head = head.next;
			if(nodeSet.contains(head)) {
				System.out.println("loop is found at Node: " + head.value);
				break;
			}
			nodeSet.add(head);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Node head = null;
		head  = FindLoopInLinkedList.createLinkedList(head, 10);
		head  = FindLoopInLinkedList.createLinkedList(head, 20);
		head  = FindLoopInLinkedList.createLinkedList(head, 30);
		head  = FindLoopInLinkedList.createLinkedList(head, 40);
		Node temp = head;
		head.next.next=temp;
		
		FindLoopInLinkedList.findLoopInLL(head);
		/*while(head!=null) {
			System.out.println(head.value);
			head = head.next;
		}
		*/
	}
}

class Node{
	int value;
	Node next;
}
