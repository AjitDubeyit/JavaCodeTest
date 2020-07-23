package com.ds.test.demo.DataStructureTest.array;

public class ArrayImplementationOfStack {

	int max = 20;
	int top;
	int arr[] = new int[max];
	
	public ArrayImplementationOfStack() {
		top = -1;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public void push(int val) {
		if(top>=max) {
			System.out.println("stack overflow!");
		} else {
			top = ++top;
			arr[top] = val;
		}
	}
	
	public void pop() {
		top = --top;
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arr[top]; 
		}
		return 0;
	}
	
	public static void main(String[] args) {
		ArrayImplementationOfStack stack = new ArrayImplementationOfStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		System.out.println(stack.peek());
	}
	
}
