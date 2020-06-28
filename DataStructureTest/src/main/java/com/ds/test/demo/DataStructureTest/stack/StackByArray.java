package com.ds.test.demo.DataStructureTest.stack;

public class StackByArray {

	int[] arr;
	int topOfStack;//keeps track of the cell which is last occupied in Array, this will help in insertion and deletion 
	
	public StackByArray(int size) {
		this.arr=new int[size];
		this.topOfStack = -1;
		System.out.println("Successfully created empty stack of size: " + size);
	}
	
	public void push(int value) {
		if(!isFullStack()) {
			arr[topOfStack+1]=value;
			topOfStack++;
			System.out.println("Successfully inserted " + value + " in the stack!");
		} else {
			System.out.println("Stack is full!");
		}
	}
	
	public void pop() {
		if(isEmptyStack()) {
			System.out.println("Stack is already empty");
		} else {
			System.out.println("Poping value from stack " + arr[topOfStack]);
			topOfStack--;
		}
	}
	
	
	private boolean isFullStack() {
		if(topOfStack==arr.length-1) {
			System.out.println("Stack is full");
			return true;
		}
		return false;
	}
	
	private boolean isEmptyStack() {
		if(topOfStack==-1) {
			return true;
		}
		return false;
	}
	
	public void peek() {
		if(!isEmptyStack()) {
			System.out.println("Top of stack: " + arr[topOfStack]);
		} else {
			System.out.println("The stack is Empty!!");
		}
		System.out.println();System.out.println();
	}
	
	public void delete() {
		arr=null;
		System.out.println("Stack is successfullly deleted!!");
	}
	
	public static void main(String[] args) {
		StackByArray a = new StackByArray(4);
		a.push(10);
		a.push(20);
		a.push(30);
		a.pop();
		a.peek();
		//a.delete();
	}
}
