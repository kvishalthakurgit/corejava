package ipa;

class St1 {
	static {
		System.out.println("hii 1 static");
	}
}

class St2 {
	static {
		System.out.println("hii 2 static");
	}
	public St2() {
		System.out.println("st2 const call");
	}
}

public class StaticCheck {
	static{
		System.out.println("main static");
	}
	public static String e3;
	public String non_static;
	public static void main(String[] args) {
		//static int inner1; inner vari can't static
		e3 = "vishal";
		//non_static = "df"; //can't initialize inside static
		System.out.println(e3.length());
		St2 s2 = new St2();
		//System.out.println(inner1);
	}
	
	public void main() {
		int inner1;
		e3 = "vishal";
		non_static = "df"; //can initialize static and non-static both
		System.out.println(e3.length());
		St2 s2 = new St2();
	}
}
