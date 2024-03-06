package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Reduce {
	  
    // Driver code
    public static void main(String[] args)
    {
  
        // Creating list of integers
        List<Integer> array = Arrays.asList(10, 4, 6, 8);
  
        // Finding sum of all elements
        array.stream().reduce((element1, element2) -> element1 + element2).stream().forEach(System.out::println);
  
        // Displaying sum of all elements
       // System.out.println("The sum of all elements is " + sum);
        
     // creating a list of Strings
        List<String> words = Arrays.asList("GFG", "vishla", "for",
                                           "GeeksQuiz", "GeeksforGeeks");
  
        Optional<String> longestString = words.stream()
                                   .reduce((word1, word2)->  word1+"-"+word2);
       // words.stream().filter(Collections.re).forEach(x-> System.out.println(x));
  
        // Displaying the longest String
        longestString.ifPresent(System.out::println);
    }
}
