package ipa;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestCollection10{  
	 public static void main(String args[]){  
	  LinkedHashSet<String> al=new LinkedHashSet<String>();  
	  
	  al.add(null);  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  	
