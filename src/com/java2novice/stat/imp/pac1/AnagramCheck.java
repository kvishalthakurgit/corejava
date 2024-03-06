package com.java2novice.stat.imp.pac1;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String[] args) {
		//System.out.println(isAnagram("worth", "howrt"));
		//System.out.println(isAnagram1("worth", "howrt"));
		String s1 ="vishal";
		System.out.println(s1.substring(2));
	}

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] inputs = word.toCharArray();

		for (char inputC : inputs) {
			int index = anagram.indexOf(inputC);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}

		return anagram.isEmpty();
	}
	
	public static boolean isAnagram1(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}

		char[] chars1 = word.toCharArray();
		char[] chars2 = anagram.toCharArray();
		
		 Arrays.sort(chars1);
	        Arrays.sort(chars2);

	        return Arrays.equals(chars1, chars2);
		
	}
}
