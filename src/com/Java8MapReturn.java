package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class UserD1 {
	private int id;
	private String name;
	private int age;

	// constructor, getters, setters, toString
	public UserD1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + age;
	}
}

public class Java8MapReturn {
	public static void main(String[] args) {
		List<UserD1> users = Arrays.asList(new UserD1(1, "Amit", 25), new UserD1(2, "Ravi", 30));
		
		List<UserD1> updatedUsers = users.stream()
		        .map(user -> {
		            user.setAge(user.getAge() + 5);      // modify
		            user.setName(user.getName().toUpperCase());
		            return user;                          // return modified object
		        })
		        .collect(Collectors.toList());

		updatedUsers.forEach(System.out::println);
	}
}
