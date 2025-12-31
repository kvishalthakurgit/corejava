package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8parallelStreamExample {
	public static void main(String[] args) {
		test();
	}
 public static void  test() {
	 List<Integer> listOfNumbers = Arrays.asList(1, 2);
	
	 System.out.println("----------------------------------------------------");
	 //int sum = listOfNumbers.stream().reduce(5, Integer::sum);
	 Optional<Integer> s = listOfNumbers.stream().reduce((x, y) -> x + y);
	 System.out.println(s.get());
	 int sum1 = listOfNumbers.parallelStream().reduce(5, (x, y) -> x + y);
	 System.out.println(sum1);
	 
	 int sum2 = listOfNumbers.stream().reduce(5, (x, y) -> x + y);
	 System.out.println(sum2);
	 
	 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

     // Sequential stream example
     System.out.println("Sequential Stream:");
     numbers.stream()
             .forEach(System.out::println);

     // Parallel stream example
     System.out.println("\nParallel Stream:");
     numbers.parallelStream()
             .forEach(System.out::println);
 }
}
