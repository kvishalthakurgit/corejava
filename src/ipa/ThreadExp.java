package ipa;

public class ThreadExp extends Thread{
	public void run() {
		System.out.println("thread is running...");
		withdraw();
	}
	synchronized void withdraw() {
		System.out.println("inside withdraw before wait");
		try {
			wait(12345);
		} catch (InterruptedException e) {
			System.out.println("execofj");
		}
		System.out.println("withdraw end line");
	}

	public static void main(String args[]) {
		ThreadExp t1 = new ThreadExp();
		t1.start();
		Season s = Season.WINTER;
		System.out.println(s.hashCode());
	}
}
