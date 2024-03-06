package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8ListTomap {
	public static void main(String[] args) {
		List<Integer> as = Arrays.asList(1,2,34,5,5,6);
		
		Resource r1 = new Resource();
		r1.setId(100);
		r1.setName("ram");
		List<String> deps = new ArrayList<>();
		deps.add("d1");
		deps.add("d2");
		deps.add("d3");
		r1.setDepartments(deps);
		
		Resource r2 = new Resource();
		r2.setId(200);
		r2.setName("shyam");
		List<String> deps1 = new ArrayList<>();
		deps1.add("d1");
		deps1.add("d2");
		deps1.add("d3");
		deps1.add("d4");
		r2.setDepartments(deps1);
		
		List<Resource> asList = Arrays.asList(r1,r2);
		
		Map<Integer, Long> collect1 = as.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		 Map<String, Long> result = asList.stream()
	                .collect(Collectors.groupingBy((x->x.getName()), Collectors.summingLong(resource -> resource.getDepartments().size())));

		 collect1.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
		
	}
}
