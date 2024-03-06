package ipa;

import java.io.IOException;

class Xyz{
	public void math1() throws Exception{ 
		System.out.println("math1 call");
	}
}

public class LIstCheck extends Xyz {
	
	@Override
	public void math1() throws IOException{
		System.out.println("override math1");
	}
	
	public static void main(String[] args) throws Exception {
		Xyz x1 = new LIstCheck();
		x1.math1();
	}
}
