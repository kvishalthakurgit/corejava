package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateRemoveArrayList {
	List<Integer> addItem = new ArrayList<Integer>();

	List<Integer> result = new ArrayList<Integer>();

	Set<Integer> setObj = new HashSet<Integer>();

	private void removeLogic() {
		addItem.add(33);
		addItem.add(41);
		addItem.add(31);
		addItem.add(31);
		addItem.add(31);
//		for (Integer in : addItem) {
//			if (setObj.add(in)) {
//				result.add(in);
//			}
//		}
		setObj = addItem.stream().collect(Collectors.toSet());
		System.out.println(setObj);
	}

	public static void main(String[] args) {
		DuplicateRemoveArrayList arrayList = new DuplicateRemoveArrayList();
		arrayList.removeLogic();
	}
}
