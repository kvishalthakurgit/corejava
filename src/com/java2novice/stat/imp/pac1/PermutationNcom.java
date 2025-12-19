package com.java2novice.stat.imp.pac1;

public class PermutationNcom {
	public static void main(String[] args) {
		String input = "12345";
		generatePermutations("", input);
	}

	private static void generatePermutations(String prefix, String remaining) {
		System.out.println("test");
		int n = remaining.length();

		// Base case: If the remaining string is empty, print the current permutation
		if (n == 0) {
			System.out.println(prefix);
		} 
		
		else {
			// Recursive case: Generate permutations by fixing each character at the
			// beginning
			for (int i = 0; i < n; i++) {
				String newPrefix = prefix + remaining.charAt(i); //1
				String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
				generatePermutations(newPrefix, newRemaining);
			}
		}
		
	}// 0 1 1 2 3
}
//12345
//54321
//43215