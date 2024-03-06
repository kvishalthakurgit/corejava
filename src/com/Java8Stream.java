package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import ipa.Employee;

//java 8 max occure word
//java 8 duplicate check list map array
public class Java8Stream {
	
	protected Java8Stream(int i) {
		// TODO Auto-generated constructor stub
	}
	
	public Java8Stream() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		//logic to get values between given inputs
		IntStream.range(1, 15).boxed().collect(Collectors.toList());
		
		//logic to skip any value from given input
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.print(x+","));
		Stream.of("xy","x","xyz").filter(x->x.length()!=1).collect(Collectors.toList());
		
		//logic to sum of given inputs.
		System.out.println(IntStream.range(1, 10).sum());
		IntStream.of(1,2,3).sum();
		
		//logic to find max from given inputs
		System.out.println(IntStream.range(1, 10).max().getAsInt());
		int asInt = IntStream.of(1,2,3).max().getAsInt();
		
		//logic to sort/reverse given input..here 'of' means verags
		Stream.of(1,2,3,4).sorted().findFirst().ifPresent(System.out::println);
		int[] n1 = {1,2,3,4};
		Arrays.stream(n1).boxed().sorted((a,b)->b.compareTo(a)).distinct().collect(Collectors.toList());
		
		//logic to any string filter and short/reverse string
		String name [] = {"visal","ravi","mohan","Avi","gvisal","rgavi","vmohanv","vAvi"};
		Arrays.stream(name).filter(x -> x.startsWith("v")).sorted().forEach(System.out::println);
		Arrays.stream(name).filter(x->x.startsWith("v")).collect(Collectors.toList());
		Arrays.stream(name).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		//logic to squire of input and sum it
		List<Integer> l = Arrays.asList(1,2,3);
		Integer collect = l.stream().collect(Collectors.summingInt(x->x*x));
		
		//logic to sum given input length
		int total = Arrays.asList("visal","ravi").stream().collect(Collectors.summingInt(x->x.length()));
		total = Arrays.asList("visal","ravi").stream().mapToInt(x->x.length()).sum();
		
		//Stream if else example
		IntStream.of(100, 150, 200).map(x -> x > 100 ? x - x * 10 / 100 : x).boxed()
				.collect(Collectors.toList());
		
		//iterate custom duplicate object from list
		//removing duplicate override hashcode() and equals() in Employee class
				List<Employee> l2 = new ArrayList<>();
				Employee e1 = new Employee(1, "jvishal");
				Employee e2 = new Employee(2, "vishal1");
				Employee e3 = new Employee(1, "jvishal2");
				Employee e4 = new Employee(3, "vishal3");
				
				l2.add(e1); l2.add(e2);l2.add(e3); l2.add(e4);
				
				List<Employee> col = l2.stream().distinct().collect(Collectors.toList());
				col.forEach(
						(e)->System.out.println("ssn:-"+e.SSN));
		
		//Lamda expression
		Square r1 = (n) -> {
			n=n*n;
			System.out.println("My Runnable "+n);	
		};
		r1.calculate(12);
		
		
		//Lamda expression
		Qquare i = (x) -> {
			x=x*x;
			return x;
			};
		i.calculate(2);
	}
	
	@FunctionalInterface
	interface Square
	{
	    void calculate(int i);
	    static void m1() {
	    	
	    }
	    default void s1() {
	    	
	    }
	}
	
	@FunctionalInterface
	interface Qquare
	{
		
		public static final int i = 3;
	    int calculate(int x);
	}
}
