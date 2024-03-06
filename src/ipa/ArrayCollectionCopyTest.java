package ipa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayCollectionCopyTest {
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4};
		int arr2[] = {11,22,33,44};
		
		String s1[] = {"a","b","c","d"};
		String s2[] = {"av","vb","vc","dv"};
		
		//merge two array
		int[] array = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().toArray();
		String[] array2 = Stream.concat(Arrays.stream(s1), Arrays.stream(s2)).distinct().toArray(x-> new String[x]);
		
		
		//Array to List
		List<int[]> asList = Arrays.asList(arr1);
		
		//List to array
		Object[] array3 = asList.toArray();
		
		
		List<int[]> list2 = Arrays.asList(arr1);
		List<int[]> list3 = Arrays.asList(arr2);
		
		//merge list
		List<int[]> collect = Stream.concat(list2.stream(), list3.stream()).collect(Collectors.toList());
		
		Integer collect2 = collect.stream().map(x ->x.length).collect(Collectors.summingInt(x->x));
		int collect3 = collect.stream().mapToInt(x ->x.length).sum();
		System.out.println(collect2==collect3);
		
		
		
		
		
	}
}
