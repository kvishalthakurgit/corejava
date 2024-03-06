package com.java2novice.stat.imp.pac2;

//5*4*3*2*1
public class FactorialExample {

	private FactorialExample() {

	}

	public static void main(String args[]) {
		factorial(5);
	}

	// using recurson
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else {
			int i = n * factorial(n - 1);
			System.out.println("i= " + i + " n= " + n);
			return i;
		}
	}
}
