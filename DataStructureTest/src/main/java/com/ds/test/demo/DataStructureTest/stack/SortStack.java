package com.ds.test.demo.DataStructureTest.stack;

import java.util.Stack;

public class SortStack {

	public static Stack<Integer> sortStack(Stack<Integer> stack) {
		Stack<Integer> tempStack = new Stack<Integer>();
		
		while(!stack.isEmpty()) {
			int a = stack.pop();
			
			while(!tempStack.isEmpty() && tempStack.peek() > a) {
				stack.push(tempStack.pop());
			}
			tempStack.push(a);
		}
		return tempStack;
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(50);
		stack.push(10);
		stack.push(40);
		//stack.push(30);
		//stack.push(20);
		//stack.push(60);
		
		Stack<Integer> sortedStack = SortStack.sortStack(stack);
		
		while(!sortedStack.isEmpty()) {
			System.out.println(sortedStack.pop());
		}
		
	}
}
