package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MaxOccurenceWordNumber {
	Map<String, Integer> wordCounts = new HashMap<String, Integer>();

	public static void main(String[] args) {
		MaxOccurenceWordNumber m1 = new MaxOccurenceWordNumber();
		m1.myLogic();
		m1.maxNumberOfWord();
	}

	private void myLogic() {
		String wordOccurrence = "abvasssSSssssssssbc";
		String[] words = wordOccurrence.split("");
		for (String word : words) {
			Integer count = wordCounts.get(word);
			if (count == null) {
				count = 0;
			}
			wordCounts.put(word, count + 1);
		}
		System.out.println(wordCounts);
	}

	private void maxNumberOfWord() {
		String largeWord = null;
		int large = 0;
		for(Map.Entry<String, Integer> entry: wordCounts.entrySet()) {
			if(entry.getValue()>large){
				largeWord = entry.getKey();
				large = entry.getValue();
			}
		}
		System.out.println(largeWord +"  "+large);
	}
}
