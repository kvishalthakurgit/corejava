package com.java2novice.stat.imp.pac2;


@FunctionalInterface
interface Itre{
	public static final int i = 3;
	public abstract int m1();
	
	default int m2() {
		return 0;
	}
	
	static int m3() {
		return 0;
	}
	
}

public class LamdaExp {
	
	public static int myMethod() {
		return 0;
	}
	
	public static void main(String[] args) {
		Itre itr = ()->{
			System.out.println("hello");
			 return 0;
		};
		itr.m1();
		
		Itre i = LamdaExp::myMethod;
		
	}
}
