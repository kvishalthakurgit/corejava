package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8MergeArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
		System.out.println(Arrays.toString(result));
		System.out.println("======================================");

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);

		List<Integer> result1 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

		System.out.println(result1);
	}
}
