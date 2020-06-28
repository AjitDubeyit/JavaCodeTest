package com.ds.test.demo.DataStructureTest.stack;

import java.util.Stack;

public class FindDuplicateParenthesis {
	
	public static boolean d77uplicateParenthesis(String exp){
		if(exp.length()<=4) {
			return false;
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i<exp.length(); i++) {
			if(exp.charAt(i) == '(') {
				stack.push(exp.charAt(i));
			} else {
				if(stack.peek() == '{') {
					
				}
			}
		}
		
		
		return true;
	}

}
