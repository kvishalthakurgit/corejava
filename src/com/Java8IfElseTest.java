package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8IfElseTest {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
		
		asList.addAll(asList);

        List<String> modifiedList = asList.stream()
                .map(number -> (number % 2 == 0) ? "Even: " + number : "Odd: " + number)
                .collect(Collectors.toList());
        
        asList.stream().map(n-> (n%2==0)? n : n);

        System.out.println(modifiedList);
	}
}
