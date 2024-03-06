package com.java2novice.stat.imp.pac1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Simpson implements Comparable<Simpson> {
    String name;

    Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }
}

	public class Compare {
		
		int[] i = new int[21];

		public static void main(String[] args) {
			main1("","","");

		}
		
	     public static void main1(String... sortingWithList) {
	        List<Simpson> simpsons = new ArrayList<>();
	        String []s1 = new String[23];
	        simpsons.add(new Simpson("Homer "));
	        simpsons.add(new Simpson("Marge "));
	        simpsons.add(new Simpson("Bart "));
	        simpsons.add(new Simpson("Lisa "));

	        Collections.sort(simpsons);
	        simpsons.stream().map(s -> s.name).forEach(System.out::println);

	        Collections.reverse(simpsons);
	        simpsons.stream().map(s -> s.name).forEach(System.out::println);
	    }

	}