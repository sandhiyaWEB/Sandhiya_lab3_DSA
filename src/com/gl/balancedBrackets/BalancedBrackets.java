package com.gl.balancedBrackets;

import java.util.*;

public class BalancedBrackets {

	public boolean isBalancedBracket(String input) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();

			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();

			} else {
				return false;
			}

		}
		return stack.isEmpty();

	}

}
