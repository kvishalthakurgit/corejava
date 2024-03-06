package ipa;

abstract class Wq1 {
	
	//public abstract void m2();;
	
	public Wq1(int i) {
		System.out.println("wq1 call");
	}
	
	public Wq1() {
		System.out.println("wq1 dcall");
	}
}

public class SuperConstractor extends Wq1 {
	
	final String NAME ;
	public SuperConstractor() {
		//super(10);
		this.NAME = "Fdfd";
	}
	private void math1() {
		 int i = 10;
		System.out.println("math1 call="+i++);
	}
	public static void main(String[] args) {
		SuperConstractor d1 = new SuperConstractor();
		d1.math1();
	}
}
