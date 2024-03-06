package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


//
public class IterateMap {
	public static void main(String args[]) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(100, "Vijay");
		hm.put(102, "Rahul");
		//get n p exception with treemap , hashtable value null npexp
		hm.put(43, null);
		
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
		
	}
}