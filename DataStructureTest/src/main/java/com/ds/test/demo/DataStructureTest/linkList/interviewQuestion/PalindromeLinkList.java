package com.ds.test.demo.DataStructureTest.linkList.interviewQuestion;

import java.util.Stack;

public class PalindromeLinkList {

	private class Node{
		private int value;
		private Node next;
	}
	
	private Node pushIntoLinkedList(Node head, int value) {
		Node newNode=new Node();
		newNode.value = value;
		newNode.next = head;
		head=newNode;
		return head;
	}
	
	private boolean palindromeCheck(Node head) {
		Node curr = head;
		Node runner = head;
		Stack<Integer> stack = new Stack<>();
		
		while(runner!=null && runner.next!=null) {
			stack.push(curr.value);
			curr = curr.next;
			runner= runner.next.next;
		}
		
		if(runner!=null) curr = curr.next;
		
		while(curr!=null) {
			if(stack.pop().intValue() !=curr.value) {
				return false;
			} else {
				curr = curr.next;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		PalindromeLinkList palindromeLinkList = new PalindromeLinkList();
		Node head = null;
		head = palindromeLinkList.pushIntoLinkedList(head, 10);
		head = palindromeLinkList.pushIntoLinkedList(head, 20);
		head = palindromeLinkList.pushIntoLinkedList(head, 30);
		head = palindromeLinkList.pushIntoLinkedList(head, 10);
		//head = palindromeLinkList.pushIntoLinkedList(head, 20);
		//head = palindromeLinkList.pushIntoLinkedList(head, 10);
		
		System.out.println("isPalindrome: "+palindromeLinkList.palindromeCheck(head));
		
		while(head!=null) {
			System.out.println(head.value);
			head = head.next;
		}
	}
}
