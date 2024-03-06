package com.java2novice.stat.imp.pac1;

import java.io.*;

class ThreadJoine extends Thread {
	public void run() {
		for (int j = 0; j < 5; j++) {
			try {
				Thread.sleep(300);
				System.out.println("The current thread name is run: " + Thread.currentThread().getName());
			} catch (Exception e) {
				System.out.println("The exception has been caught: " + e);
			}
			System.out.println(j);
		}
	}
}

class ThreadJoin {
	public static void main(String argvs[]) {

		ThreadJoine th1 = new ThreadJoine();
		ThreadJoine th2 = new ThreadJoine();
		ThreadJoine th3 = new ThreadJoine();
		th1.setName("A");th2.setName("B");th3.setName("C");

		th1.start();
		try {
			System.out.println("The current thread name is: " + Thread.currentThread().getName());

			th1.join();
		}

		catch (Exception e) {
			System.out.println("The exception has been caught " + e);
		}
		th2.start();

		try {
			System.out.println("The current thread name is: " + Thread.currentThread().getName());
			th2.join();
		}

		catch (Exception e) {
			System.out.println("The exception has been caught " + e);
		}

		th3.start();
	}
}