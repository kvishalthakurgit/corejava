package ipa;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsentExample {
	public static void main(String[] args) {
		Map<String, Integer> mapTest = new HashMap<>();
		
		String word1 = "example";
        mapTest.put(word1, 7);
        
        
        mapTest.compute(word1, (k, v) -> (v == null) ? k.length() : v + 1);
        mapTest.compute(word1, (k,v) -> (k.length()>5) ? v+10 :v);
        
        
        System.out.println(mapTest);
        
        ///////////////////////////
        
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(10, "Aman");
        map1.put(20, "Suraj");
        map1.put(30, "Harsh");
        
        map1.computeIfAbsent(40, x -> "test");
        System.out.println(map1);
        
																					
	}
}
