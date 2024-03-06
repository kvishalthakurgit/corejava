package com.java2novice.stat.imp.pac1;

class First 
{ 
	int i = 10; 

	public First(int j) 
	{ 
		System.out.println(i); 
		this.i = j * 10; 
	} 
} 

class Second extends First 
{ 
	public Second(int j) 
	{ 
		super(j); 
		System.out.println(i); 
		this.i = j * 20; 
	} 
} 

public class MainClass 
{ 
	 public void main1(String args[]) {    
	        System.out.println(fun()); 
	    }  
	    int fun() { 
	        return 20; 
	    }  
} 



