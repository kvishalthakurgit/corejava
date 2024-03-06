package com;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
	public static void main(String[] args) {
		//null insertion is not possible in ConcurrentHashMap as key or value
		//In ConcurrentHashMap, the Object is divided into number of segments according to the concurrency level.
		//Default concurrency-level of ConcurrentHashMap is 16.
		//Map<Object, Object> synchronizedMap = Collections.synchronizedMap(null);
		Map<String, String> premiumPhone = new ConcurrentHashMap<String, String>(new HashMap());
		List cpn = new CopyOnWriteArrayList(new Vector());     //it is thread safe also
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "S5");

		Iterator iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Z");
		}
		
		System.out.println(premiumPhone);

	}

}