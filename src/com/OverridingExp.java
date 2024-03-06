package com;

class A{
	public void m1() {
		System.out.println("A");
	}
}

class B extends A{
	public void m1() {
		System.out.println("B");
	}
}

public class OverridingExp extends B{
	public static void main(String[] args) {
		B a1 = new OverridingExp();
		a1.m1();
		
		Runnable r2 = () -> {
		      System.out.println("Thread name : " + Thread.currentThread().getName());
		    };
		    r2.run();
		    
	}
}
