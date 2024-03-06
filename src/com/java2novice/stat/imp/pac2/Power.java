package com.java2novice.stat.imp.pac2;

public class Power {
	public static void main(String[] args) {
	System.out.println(getResult(32));
	}		
	public static boolean getResult(int n) {
		while(n>1) {
			if(n%2!=0) {
				return false;
			} else if (n/2 == 1) {
				return true;
			}else {
				n = n/2;
			}
		}
		return false;
	}
}
