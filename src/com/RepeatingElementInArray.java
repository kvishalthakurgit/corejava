package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class RepeatingElementInArray {
	int min;
	 void printFirstRepeating(Integer arr[]) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			min = -1;
			if (set.contains(arr[i])){
				min = i;
			}
			else{
				set.add(arr[i]);
				}
			if (min != -1)
				System.out.println("The repeating element is " + arr[min]);
		}
	}
	public static void main(String[] args) {
		int arr1[] = {10, 5, 3, 4, 3, 5, 6, 3};
		Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		RepeatingElementInArray array = new RepeatingElementInArray();
        //array.printFirstRepeating(arr);
        
      //Java 8
		Integer arr[] = {10, 5, 3, 4, 3, 5, 6, 3}; //can direct work as above line
        List<Integer> l = Arrays.asList(arr);
        Map<Integer, Long> collect = l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        collect.entrySet().stream().filter(entry->entry.getValue()>1).forEach(e ->{
        	System.out.println(e.getKey()+"=="+e.getValue());
        });
        
        collect.entrySet().stream().max(Map.Entry.comparingByValue());
        
	}
}
