package com;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;

class F1 {
	public Object m1() {
		return "";

	}
}

public class Java8OptionalExample {
	public static void main(String[] args) {
		Integer i = 10;
		Integer j = 10;
		System.out.println(i.equals(j));
		String[] str = new String[10];

		Optional<String> checkNull = Optional.ofNullable(str[5]);
		
		if (checkNull.isPresent()) { // check for value is present or not
			System.out.println("present");
			System.out.println(checkNull.get());
		} else
			System.out.println("value is not present");
			System.out.println("empty check=="+checkNull.isEmpty());
		
		checkNull.ifPresentOrElse((value) -> {
			System.out.println("Value is present, its: " + value);
		}, () -> {
			System.out.println("Value is empty");
		});

		ofTest();
	}

	private static void ofTest() {
		// create a Optional
		Optional<Integer> op = Optional.of(123);
		// apply ifPresentOrElse
		op.ifPresentOrElse((value) -> {
			System.out.println("Value is present, its: " + value);
		}, () -> {
			System.out.println("Value is empty");
		});
		
		op.ifPresent(val->{
			int i = val;
		});
	}
}