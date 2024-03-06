package com.java2novice.stat.imp.pac2;

// 0 1 1 2 3 5 8 13
public class Fibonacci {
	public static void main(String[] args) {
		int f = 0; 
		int sc = 1; 
		int sum = 0;
		System.out.print(f+","+sc+",");
		for (int i = 1; i <= 10; i++) {
		   sum = f+sc;  
		   f=sc;
		   sc=sum;
		   System.out.print(sum+",");
			
		}
	}
}

// 1
//
//
//palindrom
