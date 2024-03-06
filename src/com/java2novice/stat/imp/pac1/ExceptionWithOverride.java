package com.java2novice.stat.imp.pac1;

import java.io.IOException;

//Check Access modifier also
class Parent{   
	  
	  void msg() throws IOException{  
	    System.out.println("parent method");  
	    }    
	}    
	    
public class ExceptionWithOverride extends Parent{    
	  
	 	
	  protected void msg() throws Exception{    
	    System.out.println("TestExceptionChild");    
	  }  
	  
	  public static void main(String args[]) {    
	   Parent p = new ExceptionWithOverride();    
	   try {
		p.msg();
	} catch (Exception e) {
		e.printStackTrace();
	}    
	  }  
	  
	}    
