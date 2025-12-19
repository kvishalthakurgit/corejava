package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetCh {
	public static void main(String[] args) {
		Set<Ram> ts = new TreeSet<>();
		Ram r1 = new Ram();
		r1.setId(101);
		r1.setName("vishal");
		
		Ram r2 = new Ram();
		r2.setId(102);
		r2.setName("amit");
		
		Ram r3 = new Ram();
		r3.setId(103);
		r3.setName("suresh");

		ts.add(r1); ts.add(r2); ts.add(r3);
		
		ts.forEach(k->{
			System.out.println(k.getId()+" "+k.getName());
		});
	}
}

class Ram implements Comparable<Ram>{
	int id; 
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Override
//	public int compareTo(Ram rm) {
//		if(id==rm.id)  
//			return 0;  
//			else if(id>rm.id)  
//			return -1;  
//			else  
//			return 1;  
//			}  
	
	@Override
    public int compareTo(Ram rm) {
        return this.name.compareTo(rm.getName());
    }
	}
	
