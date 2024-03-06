package com;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {
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
	
}

public class Java8EmployeeTest {
	
	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<>();
		Emp e1 = new Emp();
		e1.setId(100); e1.setName("vishla");
		
		Emp e2 = new Emp();
		e2.setId(101); e2.setName("amit");
		Emp e3 = new Emp();
		e3.setId(103); e3.setName("rahu");
		
		Emp e4 = new Emp();
		e4.setId(103); e4.setName("rahu");
		empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);
		
		List<Emp> collect = empList.stream().sorted(Comparator.comparing(Emp :: getName)).collect(Collectors.toList());
		collect.forEach(e -> System.out.println(e.getId()+" "+e.getName()));
		List<String> collect2 = empList.stream().map(Emp :: getName).collect(Collectors.toList());
		
		
	}
}
