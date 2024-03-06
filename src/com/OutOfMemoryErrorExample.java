package com;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        testOutOfMemory();
    }
    
    public static void testOutOfMemory(){
    	try {
            List<Object> objects = new ArrayList<>();

            while (true) {
                objects.add(new Object());
            }
        } catch (Exception e) {
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
        }
    	
    	System.out.println("rest of the code");
    }
}
