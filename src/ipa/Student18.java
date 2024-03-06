package ipa;

public class Student18 implements Cloneable {
	public static void main(String[] args) {
//		String s1 = "vishal";
//		String s2 = "vishal";
		String s1 = new String("vishal");
		String s2 = new String("vishal");
		
		System.out.println(s1.hashCode()==s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}
}
