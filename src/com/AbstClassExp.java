package com;

abstract class  Ab1 {
	public Ab1(){
		
	}
	public Ab1(int i) {
		System.out.println("Ab1 const");
	}
	public static void main(String[] args) {
		//Ab1 a = new Ab1(1);
	}
}

public class AbstClassExp extends Ab1{
	public AbstClassExp(int i) {
		super(1);
	}
	
	public static void main(String[] args) {
		AbstClassExp a1 = new AbstClassExp(34);
	}
}
