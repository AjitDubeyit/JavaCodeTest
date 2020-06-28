package com.ds.test.demo.DataStructureTest.stack;

import java.util.Stack;
//Q. Check if the given expression is balanced expression or not!
public class BalanceParenthesis {

	public static boolean balParenthesis(String exp) {

		Stack<Character> stack = new Stack<Character>();

		for(int i=0; i<exp.length(); i++) {
			if(exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[') {
				stack.push(exp.charAt(i));
			}

			if(exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']') {
				if(stack.empty()) {
					return false;
				}

				Character top = stack.pop();

				if((top == '(' && exp.charAt(i) != ')') ||
						(top == '{' && exp.charAt(i) != '}') ||
						(top == '[' && exp.charAt(i) != ']')) {
					return false;
				}
			}
		}
		//expression is balanced only if stack is empty at this point
		return stack.empty();
	}
	
	public static void main(String[] args) {
		String exp = "{()]}[{}]";
		if(balParenthesis(exp)) {
			System.out.println("The expression is balanced!");
		} else {
			System.out.println("The expression is not balanced!");
		}
	}
}
