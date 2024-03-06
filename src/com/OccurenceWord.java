package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurenceWord {
	public static void main(String[] args) {
		String wordOccurrence = "string are count string are count string are count";
	     
		   String[] words = wordOccurrence.toLowerCase().split("\\s+");
		   
		   Map<String, Integer> countStringOccurrences = countStringOccurrences(Arrays.asList(words));
		   
		   countStringOccurrences.forEach((k,v)->{
			   System.out.println(k+" "+v);
		   });
		   
//		   Map<String, Integer> myLogic = myLogic(words);
//		   myLogic.forEach((k,v)->{
//			   System.out.println(k+" "+v);
//		   });
	}

	private static Map<String, Integer> myLogic(String[] words) {
		Map<String, Integer> wordCounts = new HashMap<String, Integer>();
		 
		   for (String word : words) {
		      Integer count = wordCounts.get(word);
		           if (count == null) {
		            count = 0;
		        }
		        wordCounts.put(word, count + 1);
		    }
		     return wordCounts;
	}
	
	public static Map<String, Integer> countStringOccurrences(List<String> inputList) {
        Map<String, Integer> occurrenceMap = new HashMap<>();

        // Count occurrences of each string
        for (String str : inputList) {
            occurrenceMap.put(str, occurrenceMap.getOrDefault(str, 0) + 1);
        }

        return occurrenceMap;
    }
}
