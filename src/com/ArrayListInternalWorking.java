package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListInternalWorking {
	public static void main(String[] args) {
		Object[] i = { 1, 2, 3, 4, 5 };
		
		i = new Object[10]; //default capacity
		//(dc * 3/2) + 1
		
		i = Arrays.copyOf(i, 20); //increase size
		
		i[19] = 654; //exp
		System.out.println(i[14]);
		
		List l = new ArrayList();
		boolean add = l.add(l);
		
		Set s = new HashSet();
		boolean add2 = s.add(s);
		
		Map m = new HashMap();
		Object put = m.put(1, l);
		
	}
	
}
