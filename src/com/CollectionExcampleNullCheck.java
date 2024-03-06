package com;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionExcampleNullCheck {
	public static void main(String[] args) {
		// Hashtable<Integer, String> hm=new Hashtable<Integer,String>();  
		Map<Integer, String> hm=new ConcurrentHashMap<>();  
		    System.out.println("Initial list of elements: "+hm);  
		      hm.put(2,"Amit");    
		      hm.put(1,null);    
		      hm.put(102,"Rahul");   
		      
		      System.out.println(hm);
		      
	}
}
