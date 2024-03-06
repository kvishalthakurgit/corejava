package com;

public class Item {
	public int item_ID;
	public String item_name;

	public Item(int item_ID, String item_name) {
		this.item_ID = item_ID;
		this.item_name = item_name;
	}
	
	@Override
	public int hashCode() {
		return item_ID+item_name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals call");
		Item item = (Item)obj;
		if(item.item_ID == this.item_ID || item.item_name.equals(this.item_name)){
			return true;
		}
		else{
			return false;
		}
	}
}
