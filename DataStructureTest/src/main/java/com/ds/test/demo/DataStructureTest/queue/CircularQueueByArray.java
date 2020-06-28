package com.ds.test.demo.DataStructureTest.queue;

public class CircularQueueByArray {

	int arr[];
	int topOfQueue;
	int size;
	int start;
	
	public CircularQueueByArray(int size) {
		arr = new int[size];
		topOfQueue = -1;
		this.size = size;
		start = -1;
	}
	
	public void enQueue(int value) {
		if(arr == null) {
			System.out.println("array is not yet created please create array first!");
		} else if(isFull()) {
			System.out.println("queue is overflow!");
		} else {
			initializeStartArray();
			if(topOfQueue+1==size) {//top of cell is already at last cell of array, then reset it to the first cell.
				topOfQueue = 0;
			} else { 
				topOfQueue++;
			}
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted value " + value + "in queue!");
		}
	}
	
	public void initializeStartArray() {
		if(start == -1) {
			start = 0;
		}
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!");
		} else {
			System.out.println("----------------");
			System.out.println("Before deque");
			printArray();
			System.out.println("deQueuing value from queue..");
			System.out.println("deQueued " + arr[start]);
			arr[start] = 0;
			if(start == topOfQueue) {//if only one element in queue
				start = topOfQueue = -1;
			} else if(start+1 == size) {
				start = 0;
			} else {
				start++;
			}
		}
		System.out.println("After deqeue");
		printArray();
		System.out.println();
	}
	
	public void printArray() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("Start " + start);
		System.out.println("End " + topOfQueue);
	}
	public boolean isFull() {
		if(topOfQueue+1 == start) {
			return true;
			
		} else if((start == 0) && (topOfQueue+1==size)) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(topOfQueue==-1)
			return true;
		return false;
	}
	
	public void peek() {
		if(!isEmpty()) {
			System.out.println(arr[start]);
		} else {
			System.out.println("Queue is empty!");
		}
	}
	
	public static void main(String[] args) {
		CircularQueueByArray cQueue = new CircularQueueByArray(4);
		cQueue.enQueue(10);
		cQueue.enQueue(20);
		cQueue.enQueue(30);
		cQueue.enQueue(40);
		
		System.out.println();
		
		
		cQueue.deQueue();
		
		System.out.println();
		
		cQueue.peek();
	}
}
