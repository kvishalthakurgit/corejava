package ipa;

enum Season {
	WINTER;
	public void math1(){
		System.out.println("enum math");
	}
}

public class EnumExample2 {
	public static void main(String[] args) {
		Season s = Season.WINTER;
		s.math1();
		System.out.println(s.hashCode());
	}
}
