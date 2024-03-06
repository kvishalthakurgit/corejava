package com;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Java8IterateMap {
	public static void main(String args[]) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(100, "Vijay");
		hm.put(102, "Rahul");
		
		//by java8
		hm.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
		
		//for-each
		for(Integer key : hm.keySet()){
			System.out.println(key);
			System.out.println(hm.get(key));
		}
		
		//for-each entryset
				for(Map.Entry<Integer, String> m:hm.entrySet()){  
					   System.out.println(m.getKey()+" "+m.getValue());  
				}
		
		//by keySet
		Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			hm.get(key);
		}
		
		//by entrySet
		Iterator<Entry<Integer, String>> itr1 = hm.entrySet().iterator();
		while(itr1.hasNext()){
			Entry<Integer, String> ent = itr1.next();
			ent.getKey();
			ent.getValue();
		}
		
		
		
		System.out.println("=====================================");
		Map<Integer, String> hmap = new HashMap<Integer, String>(); 
	      hmap.put(1, "ABC");
	      hmap.put(2, "XCB");
	      hmap.put(3, "ABB");
	      hmap.put(4, "ZIO");
	      
	    


			Map<Integer, String> result = hmap.entrySet().stream().filter(entry -> entry.getKey().intValue() > 4)
					.filter(entry -> entry.getValue().startsWith("Z"))
					.collect(Collectors.toMap(entry -> entry.getKey(), entry-> entry.getValue()));
			
			Map<Integer, String> result1 = hmap.entrySet().stream().filter(p -> p.getKey().intValue() > 4)
					//.filter(map -> map.getValue().startsWith("Z"))
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
			
			Map<Integer, String> result2 = hmap.keySet().stream()
	                .filter(key -> key.intValue() > 4)
	                .filter(key -> hmap.get(key).startsWith("Z"))
	                //.collect(Collectors.toMap(key -> key, hmap::get));
				.collect(Collectors.toMap(key -> key, value ->hmap.get(value)));
			

	     System.out.println("Result: " + result);
	     
		
	}
}