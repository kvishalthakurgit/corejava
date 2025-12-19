package com;

public class WordOccurenceCount {
	public static void main(String[] args) {
		String s2 = "vviillsshhaallvv";
		int index = 0;
		while( (index = s2.indexOf("ll", index))!=-1) {
			System.out.println("test "+index);
			index++;
		}
	}
}
