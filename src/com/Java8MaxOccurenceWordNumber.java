package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

//try with java8
public class Java8MaxOccurenceWordNumber {
	Map<String, Integer> wordCounts = new HashMap<String, Integer>();

	public static void main(String[] args) {
		Java8MaxOccurenceWordNumber m1 = new Java8MaxOccurenceWordNumber();
		m1.myLogic();
		m1.maxNumberOfWord();
		
		java8Logic();
	}

	private void myLogic() {
		String wordOccurrence = "abvasssSSsssssssbc";
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
	
	private static void java8Logic() {
		String wordOccurrence = "abvasssSSsssssssbc";
		String[] words = wordOccurrence.split("");
		Map<String, Long> wordCountMap = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(wordCountMap);
		
		 Optional<Long> max = wordCountMap.entrySet().stream()
                .map(entry->entry.getValue()).max(Comparator.comparingInt(x->x.intValue()));
		 
		System.out.println( max.get());
		
		 Entry<String, Long> entry = wordCountMap.entrySet().stream()
	                .max(Map.Entry.comparingByValue()).get();
		 System.out.println(entry.getKey()+""+entry.getValue());
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
