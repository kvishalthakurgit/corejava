package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Test {
	private static void testForEach() {
		List<String> words = Arrays.asList("month","apple", "banana", "orange", "grape", "kiwi");
		for (String string : words) {
			System.out.println(string);
		}
		System.out.println("-----------------------------------------");
        words.parallelStream()
             .forEachOrdered(word -> System.out.println("Processing forEachOrdered: " + word));
        System.out.println("-----------------------------------------");
        //words.stream()
        //.forEachOrdered(word -> System.out.println("Processing: " + word));
        System.out.println("-----------------------------------------");
        words.parallelStream()
        .forEach(word -> System.out.println("Processing: forEach: " + word));
	}
	
	int j =0;
	private  void parallelStream() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sumOfSquares = numbers.stream()
                                  .mapToInt(x -> x * x)
                                  .sum();

        List<Integer> list = IntStream.of(100, 150, 200).map(x -> x > 100 ? x - x * 10 / 100 : x).boxed()
        		.collect(Collectors.toList());

        
        numbers.stream().forEach(x ->{
        	if(x>100) {
        		j= x*10/100;
        	}
        });
        
        		Integer total = list.stream().collect(Collectors.summingInt(x -> x));
        		list.stream().mapToInt(x->x).sum();

        System.out.println("Sum of Squares (Sequential): " + sumOfSquares);

	}
	
	private static void testOptional() {
		String[] str = new String[10];        
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE"; 
        Optional<String> value = Optional.of(str[7]);  
        System.out.println(value);
	}
	
	public static void main(String[] args) {
		//Java8Test.testForEach();
		//parallelStream();
		testOptional();
	}
}
@interface
Games{  
      
}  