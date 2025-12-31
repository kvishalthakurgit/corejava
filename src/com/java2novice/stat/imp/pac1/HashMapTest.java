package com.java2novice.stat.imp.pac1;

import java.util.HashMap;
import java.util.Map;

class Employee {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 100;          // going to check eq every time, and check id values
		//return this.id;
	} // if hash not override so equals not calling and adding duplicates here

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;

		Employee other = (Employee) obj;

		// CASE 1: always true
		 //return true;             //if hash same so only 1 obj store then true mean remaing all are same

		// CASE 2: always false
		 //return false;				// duplicate now added

		// CASE 3: logical equality (recommended)
		return this.id == other.id;
	}
}

public class HashMapTest {
	public static void main(String[] args) {

		Map<Employee, String> map = new HashMap<>();

		Employee e1 = new Employee(1, "A");
		Employee e2 = new Employee(2, "B");
		Employee e3 = new Employee(3, "C");
		Employee e4 = new Employee(2, "C");

		map.put(e1, "First");		
		map.put(e2, "Second");
		map.put(e3, "Third");
		map.put(e4, "Third");

		System.out.println("Map size: " + map.size());

		map.forEach((k, v) -> System.out.println(k.id + " -> " + v));
	}
}
