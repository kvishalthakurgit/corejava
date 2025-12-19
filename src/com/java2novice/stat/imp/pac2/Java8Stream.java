package com.java2novice.stat.imp.pac2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ipa.Employee;

public class Java8Stream {
	
	protected Java8Stream(int i) {
		// TODO Auto-generated constructor stub
	}
	
	public Java8Stream() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		//print number on given number range
		//IntStream.range(1, 16).forEach(x -> System.out.println(x));
		
		//skip upto given number
		//IntStream.range(1, 10).skip(5).forEach(x -> System.out.print(x+","));
		
		//sum item on geven range
		//System.out.println(IntStream.range(1, 10).sum());
		
		//find max on given range
		//System.out.println(IntStream.range(1, 10).max().getAsInt());
		
		//find first shorted string..here 'of' means verags
		//Stream.of(1,2,3,4).sorted().findFirst().ifPresent(System.out::println);
		
		//sorting and filter of string-array
		//String name [] = {"visal","ravi","mohan","Avi","gvisal","rgavi","vmohanv","vAvi"};
		//Arrays.stream(name).filter(x -> x.startsWith("v")).sorted().forEach(System.out::println);
		
		//addition of squire
		//Integer num [] = {1, 2, 3};
		//Arrays.stream(num).map(x -> x * x).forEach(System.out :: println);

		//iterate ArrayList & filter & string validation
		//List<String> l1 = new ArrayList<>();
		//l1.add("nfndhjs"); l1.add("rdfqds"); l1.add("egfds"); l1.add("wsfds"); l1.add("gfds"); l1.add("efds");
		//l1.stream().filter(x -> x.startsWith("E")).map(String :: toUpperCase).forEach(System.out :: println);
		//Set<String> collect = l1.stream().filter(y->y.length()>1).map(y->y.toUpperCase()).collect(Collectors.toSet());
		
		//added return type with list iterate
		List<String> l1 = new ArrayList<>();
		l1.add("nfndhjs"); l1.add("rdfqds"); l1.add("egfds"); l1.add("wsfds"); l1.add("gfds"); l1.add("efds");
		List<String> collect = l1.stream().map(String :: toUpperCase).filter(x -> x.startsWith("E")).collect(Collectors.toList());
		int total = l1.stream().mapToInt(String::length).sum();
		System.out.println(total);
		
		//remove duplicate from list
		//List<String> l1 = new ArrayList<>();
		//l1.add("nfndhjs"); l1.add("rdfqds"); l1.add("egfds"); l1.add("wsfds"); l1.add("gfds"); l1.add("efds");
		//List<String> collect = l1.stream().distinct().collect(Collectors.toList());
		//System.out.println(collect);
		
		//iterate custom duplicate object from list
				/*List<Employee> l2 = new ArrayList<>();
				Employee e1 = new Employee(1, "jvishal");
				Employee e2 = new Employee(1, "vishal");
				
				l2.add(e1); l2.add(e2);
				
				List<Employee> collect = l2.stream().distinct().map(e->e).collect(Collectors.toList());
				collect.forEach(
						(e)->System.out.println(e.SSN));*/
		
		//iterate map
		/*Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});*/
		
		//Lamda expression
		//Square r1 = () -> System.out.println("My Runnable");
		//r1.calculate();
		
		
		//Lamda expression
		//Qquare i = (int x) -> x*x;
		//System.out.println(i.calculate(4));
		
		/*Chek c = () ->{
			System.out.println("d");
			return 0;
		};
	
		System.out.println("done");*/
	}
	
	@FunctionalInterface
	interface Square
	{
	    //int calculate(int x);
	    void calculate();
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
	
	
	interface Chek
	{
		public static final int  n1 = 10;
	    public abstract int calculate();
	}

	
}
