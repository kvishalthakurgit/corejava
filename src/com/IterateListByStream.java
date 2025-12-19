package com;

import java.util.HashSet;
import java.util.Set;

public class IterateListByStream {
	public static void main(String[] args) {
		Set<String> listObj = new HashSet<String>();
		 
		listObj.add(null);
		listObj.add("eBay1");
		listObj.add("eBay2");
		
		
		listObj.forEach(temp -> {
			System.out.println(temp);
		});

	}
}
