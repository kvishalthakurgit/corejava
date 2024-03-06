package com;

public class ErrorHandling {
	private void math1() {
		try {
			throw new StackOverflowError();
		} catch (Exception e) {
			System.out.println("exception " + e);
		}
		catch(Error e){
			System.out.println("Error = "+e);
		}
		System.out.println("rest of the code");
	}

	public static void main(String[] args) {
		ErrorHandling e = new ErrorHandling();
		e.math1();
	}
}
