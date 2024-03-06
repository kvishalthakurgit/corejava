package ipa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };

		ArrayList<String> citylist = new ArrayList<String>();
		boolean addAll = Collections.addAll(citylist, citynames); // extra way

		// Array to list
		List<String> asList = Arrays.asList(citynames);
		// List to Array
		asList.toArray();
	}
}
