package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//use java 8 list.stream().distinct().collect(Collectors.toList());
public class RemoveDuplicateObjInArrayListExample {
	List<Item> addItem = new ArrayList<Item>();

	List<Item> result = new ArrayList<Item>();
	
	Set<Integer> setObj = new HashSet<Integer>();

	private void removeLogic() {
		Item item1 = new Item(123, "shope");
		Item item11 = new Item(23, "shope");
		
		addItem.add(item1);
		addItem.add(item1);
		addItem.add(item11);
		addItem.stream().distinct().forEach(x-> System.out.println(x));
		for (Item item : addItem) {
			if (setObj.add(item.item_ID)) {
				result.add(item);
			}
		}
		System.out.println("result="+result.size());
	}
	public static void main(String[] args) {
		RemoveDuplicateObjInArrayListExample arrayList = new RemoveDuplicateObjInArrayListExample();
		arrayList.removeLogic();
	}
}
