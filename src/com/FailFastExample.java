package com;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//SynchronizedList/Map/Set is threadsafe but gives concurentException
public class FailFastExample {
	public static void main(String[] args) {
		Map<String, String> premiumPhone = new HashMap<String, String>();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "S5");

		Map<String, String> synchronizedMap = Collections.synchronizedMap(premiumPhone);
		
		Iterator iterator = synchronizedMap.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			synchronizedMap.put("Sony", "Xperia Z");
		}

	}

}