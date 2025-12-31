package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8MapMethods {
	public static void main(String[] args) {
		putIfAbs();
		computeIfAbsent();
		computeIfPresent();
		compute();
	}

	private static void compute() {
		Map<String, Integer> map = new HashMap<>();
		map.compute("A", (k, v) -> (v == null) ? 1 : v + 1);
		map.compute("A", (k, v) -> v + 1);
		System.out.println(map);
	}

	private static void computeIfPresent() {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.computeIfPresent("A", (k, v) -> (v == null) ? 1 : v + 1);
		map.computeIfPresent("B", (k, v) -> v + 5); 
		System.out.println(map);
	}

	private static void computeIfAbsent() {
		Map<String, List<String>> map = new HashMap<>();
		map.computeIfAbsent("fruits", k -> new ArrayList<>()).add("Apple");
		System.out.println(map);
	}

	private static void putIfAbs() {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.putIfAbsent("A", 20); //does not overwrite 
		map.putIfAbsent("B", 30); //put

		System.out.println(map);
	}
}
