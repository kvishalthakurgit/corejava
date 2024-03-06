package com;

public class OverloadingCheck {

	public void math1() {
		System.out.println("1");
	}
	
	public int math1(int i) {
		System.out.println("2");
		return 2;
	}
	
	public int math1(Integer i) {
		System.out.println("3");
		return 3;
	}
	
	public int math1(Object i) {
		System.out.println("4");
		return 4;
	}
	
	public void math2(int i, Integer j) {
		System.out.println("5");
	}
	
	public void math2(Integer i, int j) {
		System.out.println("6");
	}
	
	public void math2(Integer i, Integer j) {
		System.out.println("7");
	}
	
	public static void main(String[] args) {
		OverloadingCheck o = new OverloadingCheck();
		o.math1(3);
		//o.math2(10, 20);    //ambiguty error
	}
}
