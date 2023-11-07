package com.gl.balancedBrackets;

import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {

		BalancedBrackets obj = new BalancedBrackets();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string of brackets: ");
		String input = sc.next();
		boolean output = obj.isBalancedBracket(input);
		if (output) {
			System.out.println("All brackets are balanced");
		} else {
			System.out.println("Brackets are not balanced");
		}

	}

}
