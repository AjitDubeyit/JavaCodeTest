package com.example.coadingtest.stack;

import java.util.Stack;

public class StackSorting {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(10);
		stack.add(5);
		stack.add(20);
		stack.add(15);
		
		StackSorting s = new StackSorting();
		stack = s.sortStack(stack);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
		
	public Stack<Integer> sortStack(Stack<Integer> stack){
		Stack<Integer> tempStack = new Stack<Integer>();
		while(!stack.isEmpty()) {
			int a = stack.pop();
			
			while(!tempStack.isEmpty() && tempStack.peek()>a) {
				stack.push(tempStack.pop());
			}
			tempStack.push(a);
		}
		
		return tempStack;
	}

}
