package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class User {
    
    
	private String name;
    private int age;
    public User(String string, int i) {
    	this.age = i;
    	this.name = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

    // Constructor, getters, setters and toString()
}
public class Java8Compare{
     public static void main(String []args){
    	 List<User> userList = new ArrayList<>(Arrays.asList(
    		        new User("John", 33), 
    		        new User("Robert", 26), 
    		        new User("Mark", 26), 
    		        new User("Brandon", 42)));

    	 List<User> sortedList = userList.stream()
    			 //.sorted(Comparator.comparing(User:: getName).reversed())
    			 .sorted(Comparator.comparingInt(x->x.getAge()))
    			 //.filter("Mark"::equals)
    			 .collect(Collectors.toList());
    	 
    	 

    		for(User u1 : sortedList) {
    			System.out.println(u1.getAge()+"   "+u1.getName());
    		}
     }
}
