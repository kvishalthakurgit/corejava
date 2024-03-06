package com;

public enum SingEnum {
	instance;
	
	public static SingEnum getInstance(){
		System.out.println("got instance");
		return SingEnum.instance;
	}
	
	public void doSomething() {
		System.out.println("test");
	}
	
}
