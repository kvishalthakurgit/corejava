package com;

import java.util.HashSet;

public class HashCodeExp {
	public static void main(String[] args) 
	{
		Emp123 emp1 = new Emp123(23);
		Emp123 emp2 = new Emp123(24);
		Emp123 emp3 = new Emp123(25);
		Emp123 emp4 = new Emp123(27);
		Emp123 emp5 = new Emp123(24);
		HashSet<Emp123> hs = new HashSet<Emp123>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);
		
//		System.out.println("before contain call");
//		System.out.println("hs.contains( new Emp(25))--->>>"+hs.contains(new Emp123(25)));
//		System.out.println("after contain call");
//		
//		System.out.println("before remove call");
//		System.out.println("hs.remove( new Emp(24)--->>>"+hs.remove(new Emp123(24)));
//		System.out.println("after remove call");
//		System.out.println("Now HashSet Size--->>>"+hs.size());
	}
}
