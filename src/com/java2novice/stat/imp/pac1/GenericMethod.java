package com.java2novice.stat.imp.pac1;

public class GenericMethod<T> {
	
	private T genElements;
	
	public  GenericMethod(T elements) {
		this.genElements=elements;
	}
	public static < E > void printArray(E[] elements) {  
        for ( E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    }  
    public static void main( String args[] ) {
    	new GenericMethod(1);
    	new GenericMethod("1");
    	new GenericMethod('1');
    	new GenericMethod(true);
    	
        Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
  
        printArray( intArray  );   
  
        printArray( charArray );   
    }   
}
