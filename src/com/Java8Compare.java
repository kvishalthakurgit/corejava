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
    	 List<UserD1> userList = new ArrayList<>(Arrays.asList(
    		        new UserD1("John", 33), 
    		        new UserD1("Robert", 26), 
    		        new UserD1("Mark", 26), 
    		        new UserD1("Brandon", 42)));

    	 List<UserD1> sortedList = userList.stream()
    			 //.sorted(Comparator.comparing(User:: getName).reversed())
    			 .sorted(Comparator.comparingInt(x->x.getAge()))
    			 .collect(Collectors.toList());
    	 
    	 

    		for(UserD1 u1 : sortedList) {
    			System.out.println(u1.getAge()+"   "+u1.getName());
    		}
     }
}
