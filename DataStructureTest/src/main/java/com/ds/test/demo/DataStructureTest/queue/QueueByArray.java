package com.ds.test.demo.DataStructureTest.queue;

public class QueueByArray {

	int arr[];
	int topOfQueue;
	int beganingOfQueue;
	
	public QueueByArray(int size) {
		arr = new int[size];
		topOfQueue = -1;
		beganingOfQueue = -1;
	}
	
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("Queue is already full!");
		} else if(isEmpty()) {
			beganingOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Value " + value + " is inserted in queue!");
		} else {
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Value " + value + " is inserted in queue!");
		}
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is already empty!");
		} else {
			System.out.println("deQueue " + arr[beganingOfQueue]);
			beganingOfQueue++;
			if(beganingOfQueue>topOfQueue) {
				beganingOfQueue=topOfQueue=-1;
			}
		}
	}
	
	public boolean isFull() {
		if(topOfQueue == arr.length-1)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if((beganingOfQueue == -1) || (beganingOfQueue==arr.length))
			return true;
		return false;
	}
	
	public void printQueue() {
		System.out.println("Value of queue!");
		for(int i=beganingOfQueue; i<=topOfQueue; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void deleteQueue() {
		arr = null;
		System.out.println("Queue deleted successfully");
	}
	
	public void peek() {
		System.out.println("Peek of queue " + arr[beganingOfQueue]);
	}
	
	public static void main(String[] args) {
		QueueByArray queue = new QueueByArray(3);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		
		queue.printQueue();
		
		queue.deQueue();
		
		queue.peek();
		
		queue.printQueue();
	}
}
