package com;

public class Enumcall {
	public static void main(String[] args) {
		// can not create object of enum
		//SingEnum em = new SingEnum();
		SingEnum i1 = SingEnum.getInstance();
		SingEnum i2 = SingEnum.getInstance();
		System.out.println(i1 == i2);
	}
}
