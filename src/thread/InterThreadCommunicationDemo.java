package thread;

class BankAccount {

	private int balance = 1000;

	synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " wants to withdraw " + amount);

		while (balance < amount) {
			System.out.println("Insufficient balance. Waiting for deposit...");
			try {
				wait(); // release lock and wait
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		balance -= amount;
		System.out.println("Withdrawal successful. Remaining balance: " + balance);
	}

	synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName() + " depositing " + amount);

		balance += amount;
		System.out.println("Deposit completed. Balance: " + balance);

		notify(); // notify waiting thread
	}
}

public class InterThreadCommunicationDemo {
	public static void main(String[] args) {

		BankAccount account = new BankAccount();

		Thread withdrawThread = new Thread(() -> {
			account.withdraw(1500);
		}, "Withdraw-Thread");

		Thread depositThread = new Thread(() -> {
			try {
				Thread.sleep(3000); // simulate delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.deposit(1000);
		}, "Deposit-Thread");

		withdrawThread.start();
		depositThread.start();
	}
}
