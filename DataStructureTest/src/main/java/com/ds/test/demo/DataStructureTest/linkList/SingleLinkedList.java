package com.ds.test.demo.DataStructureTest.linkList;

import com.ds.test.demo.DataStructureTest.linkList.node.SingleNode;

public class SingleLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size; //denotes size of linklist
	
	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SingleNode createSingleLinkedList(int nodeValue) {
		head = new SingleNode();
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1; //size = 1
		return head;
	}
	
	public void insertInLinkedList(int nodeValue, int location) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		if(!existsLinkedList()) {
			System.out.println("The link list does not exist!!");
			return;
		} else if(location == 0) {//Insert at first position
			node.setNext(head);
			head=node;
		} else if(location>=size) {//Insert at last position
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		} else {//Insert at specified position
			SingleNode tempNode = head;
			int index = 0;
			while(index<location-1) {// loop will be search specified position
				tempNode = tempNode.getNext();
				index++;
			}//temp node currently references to node after which we should insert new node
			SingleNode nextNode = tempNode.getNext();//this is immediate next node after new node
			tempNode.setNext(node);//update referance of tempNode to reference to new node
			node.setNext(nextNode);//update newly added nodes next
		}
		setSize(getSize()+1);
	}
	
	public boolean existsLinkedList() {
		//if head is not null than return true otherwise return false
		return head!=null;
	}
	
	public void traverseLinkedList() {
		if(existsLinkedList()) {
			SingleNode tempNode = head;
			for(int i=0; i<getSize(); i++) {
				System.out.println(tempNode.getValue());
				if(i!=getSize() - 1) {
					System.out.println(" -> ");
				}
				tempNode = tempNode.getNext();
			}
		} else {
			System.out.println("Linked List does not exists!");
		}
		System.out.println("\n");
	}
	
	public void deleteEntireLinkedList() {
		head = null;
		tail = null;
	}
	
	//Searches a node with given value
	public boolean searchNode(int nodeValue) {
		if(existsLinkedList()) {
			SingleNode tmpNode = head;
			for(int i=0; i<getSize(); i++) {
				if(tmpNode.getValue() == nodeValue) {
					System.out.println("found the node at location " + i + "\n");
					return true;
				}
				tmpNode = tmpNode.getNext();
			}
		}
		System.out.println("Node not found!! \n");
		return false;
	}
	
	//Deletes a node having a given value
	public void deletionOfNode(int location) {
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist!!");
			return;
		} else if(location == 0) {//we want to delete first element
			head = head.getNext();
			setSize(getSize()-1);
			if(getSize()==0) {//if there is no more nodes in this list	
				tail = null;
			}
		} else if(location>=getSize()) {
			SingleNode tmpNode = head;
			for(int i=0; i<getSize()-1;i++) {
				tmpNode = tmpNode.getNext();//temp node points to second last node
			}
			if(tmpNode == head) {
				head = tail = null;
				setSize(getSize()-1);
				return;
			}
			tmpNode.setNext(null);
			tail = tmpNode;
			setSize(getSize()-1);
		} else { // if any inside node is to be deleted
			SingleNode tempNode = head;
			for(int i=0; i<location-1;i++) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(tempNode.getNext().getNext());
			setSize(getSize()-1);
		}
	}
	
	//main method
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.createSingleLinkedList(10);
		sll.insertInLinkedList(20,0);
		sll.insertInLinkedList(30,1);
		sll.insertInLinkedList(50,10);
		sll.traverseLinkedList();
		sll.searchNode(50);
		sll.deletionOfNode(10);
		System.out.println("-----------------------");
		//sll.deleteEntireLinkedList();
		sll.traverseLinkedList();
	}
}
