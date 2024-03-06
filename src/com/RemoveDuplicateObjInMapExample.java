package com;

import java.util.HashMap;
import java.util.Set;
//java8
public class RemoveDuplicateObjInMapExample {

	public static void main(String[] args) {
		storeDataInMap();
	}

	private static void storeDataInMap() {
		HashMap<Item, String> hm = new HashMap<Item, String>();
		hm.put(new Item(100, "Apple"), "fruit");
		hm.put(new Item(700, "Jeans"), "Cloth");
		hm.put(new Item(400, "Rice"), "Meal");
		
		Item new_Item = new Item(400, "Rice");
			hm.put(new_Item, "New Meal");
		printMap(hm);
	}

	private static void printMap(HashMap<Item, String> map) {

		Set<Item> keys = map.keySet();
		for (Item p : keys) {
			System.out.println(p.item_ID + "==>" + map.get(p));
		}
	}

}
