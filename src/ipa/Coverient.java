package ipa;

class A1 {
	A1 get() {
		System.out.println("get A1");
		return this;
	}
}

public class Coverient extends A1 {
	@Override
	Coverient get() {
		System.out.println("get child");
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String args[]) {
		A1 a1 = new Coverient();
		a1.get();
	}
}