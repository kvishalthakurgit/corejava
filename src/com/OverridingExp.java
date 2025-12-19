package com;

class A{
	int i = 10;
	public void m1() {
		System.out.println("A");
	}
}

class B extends A{
	int i = 100;
	public void m1() {
		System.out.println("B");
	}
}

public class OverridingExp extends B{
	public void m1() {
		System.out.println("C");
	}
	public static void main(String[] args) {
		B b1 = new OverridingExp();
		b1.m1();
		System.out.println(b1.i);
		
		A a1 = new B();
		System.out.println(a1.i);
		
		Runnable r2 = () -> {
		      System.out.println("Thread name : " + Thread.currentThread().getName());
		    };
		    r2.run();
		    
	}
}
