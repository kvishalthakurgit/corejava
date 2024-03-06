package com.java2novice.stat.imp.pac2;

import static com.java2novice.stat.imp.pac1.MyStaticMembClass.INCREMENT;
import static com.java2novice.stat.imp.pac1.MyStaticMembClass.incrementNumber;

public class MyStaticImportExmp {

	public static void main(String a[]) {
		System.out.println("Increment value: " + INCREMENT);
		//add1(); ambiguty occure
		incrementNumber(3);
	}
}
