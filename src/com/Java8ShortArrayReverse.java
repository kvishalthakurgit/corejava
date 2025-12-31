package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8ShortArrayReverse {
	public static void main(String[] args) {
        Integer[] array = {5, 2, 8, 1, 7, 3};
        int[] array1 = {5, 2, 8, 1, 7, 3};

        List<Integer> sortedArray = Arrays.stream(array1)
                .boxed()  // Convert to Stream<Integer>
                .sorted((a, b) -> b.compareTo(a))  // Sort in reverse order
                .collect(Collectors.toList());
        
		List<Integer> collect = Arrays.asList(array).stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		collect.forEach(x->System.out.print(x+" "));
		List<Integer> collect2 = Arrays.asList(array).stream().sorted(Collections.reverseOrder()).limit(1).collect(Collectors.toList());
        System.out.println(" "+collect2);
        
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Sorted Array in Reverse Order: " + sortedArray);
    }
}
