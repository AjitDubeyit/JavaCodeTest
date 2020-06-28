package com.ds.test.demo.DataStructureTest.queue;

class Node{
	private int value;
	private Node next;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}


public class QueueUsingLinkedList {
	
	Node front,rear;
	
	public QueueUsingLinkedList() {
		this.front = null;
		this.rear = null;
	}
	
	public void enQueue(int value) {
		Node node = new Node();
		node.setValue(value);
		
		if(rear == null) {
			front = rear = node;
			return;
		} else {
			this.rear.setNext(node);
			this.rear = node;
		}
	}
	
	public void deQueue() {
		
		if(front != null) {
			this.front = this.front.getNext();
			
			if(this.front.getNext()==null) {
				this.rear.setNext(null);
			}
			
		} else {
			return;
		}
	}
	
	public void peek() {
		if(front !=null) {
			System.out.println(front.getValue());
		}
	}
	
	public void printQueue() {
		Node node = this.front;
		while(node != null) {
			System.out.println(node.getValue());
			node = node.getNext();
		}
	}

	
	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		System.out.println("==============");
		
		queue.printQueue();
		System.out.println("==============");
		queue.deQueue();
		System.out.println("==============");
		queue.printQueue();
		
		System.out.println("==============");
		queue.peek();
		
	}
	
	
}
