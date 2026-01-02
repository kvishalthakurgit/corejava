package com.java2novice.stat.imp.pac2;

public class Palindrome {
	public static void main(String[] args) {
		int num = 121;
		palindromeStringTest();
		palindromeNumberTest(num);
		palindromeNumberTest1(num);
	}

	private static void palindromeNumberTest1(int num) {
		String str = String.valueOf(num);

		boolean isPalindrome = new StringBuilder(str).reverse().toString().equals(str);

		System.out.println(isPalindrome ? "Palindrome Number" : "Not Palindrome Number");
	}

	private static void palindromeNumberTest(int num) {
		int temp = num;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + (num % 10);
			num = num / 10;
		}

		if (temp == rev) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not Palindrome Number");
		}
	}

	private static void palindromeStringTest() {
		String str = "madam";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not Palindrome String");
		}
	}
}
