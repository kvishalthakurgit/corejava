package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateStudentRecordBySet {
	
	private static void addStudentRecord() {

		Set<Students> set = new HashSet();
		set.add(stu1());
		set.add(stu2());
		set.add(stu3());
		System.out.println("-----------------------------------------");
		
		for(Students std : set){
			System.out.println(std.std_Name+" "+std.std_Add+" "+std.std_Id);
		}
		
	}
	
	public static void main(String[] args) {
		addStudentRecord();
	}

	private static Students stu3() {
		Students s3 = new Students();
		s3.setStd_Add("mumbai");
		s3.setStd_Id(402);
		s3.setStd_Name("stu3");
		return s3;
	}

	private static Students stu2() {
		Students s2 = new Students();
		s2.setStd_Add("mumbai");
		s2.setStd_Id(402);
		s2.setStd_Name("stu2");
		return s2;
	}

	private static Students stu1() {
		Students s1 = new Students();
		s1.setStd_Add("pune");
		s1.setStd_Id(401);
		s1.setStd_Name("stu1");
		return s1;
	}
}
