package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FlatMap {
 public static void main(String[] args) {
	
	 
	// making the arraylist object of List of Integer
     List<List<Integer> > numbers = new ArrayList<>();
     
     // adding the elements to number arraylist
     numbers.add(Arrays.asList(1, 2));
     numbers.add(Arrays.asList(3, 4));
     numbers.add(Arrays.asList(5, 6));
     numbers.add(Arrays.asList(7, 8));
     
     
     // using flatmap() to flatten this list
    List<Integer> collect = numbers.stream()
               .flatMap(List::stream)
               .collect(Collectors.toList());
    
    List<Integer> collect1 = numbers.stream()
            .flatMap(l-> l.stream())
            .collect(Collectors.toList());
     
     // printing the list
     System.out.println("List generate by flatMap-"
                        + collect);	
     
     String s1 = "teresrsdft";
     String[] split = s1.split("");
     System.out.println("=====================================");
     //Arrays.stream(split).forEach(d-> System.out.println(d));
     //Arrays.stream(split).flatMap(Arrays.stream(split));
     //Stream.of(split).flatMap(Stream::of).toArray(String[]::new);
     
     
     
    
     
 }
}
