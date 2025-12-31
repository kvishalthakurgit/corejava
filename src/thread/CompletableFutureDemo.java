package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {

	public static void main(String[] args) throws Exception {

		System.out.println("Main thread: " + Thread.currentThread().getName());

		ExecutorService executor = Executors.newFixedThreadPool(4);

		CompletableFuture<Void> cf1 = cfCall(executor);
		CompletableFuture<Void> cf2 = cfCall(executor);

		System.out.println("Main thread is NOT blocked");

		cf1.get();
		cf2.get();
		cf1.get();
		cf2.get();
	}

	private static CompletableFuture<Void> cfCall(ExecutorService executor) {
		CompletableFuture<Void> cf = CompletableFuture.supplyAsync(() -> {
			try {
				System.out.println("Doing heavy task...");
				Thread.sleep(1000); // simulate large task
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return 100;
		}, executor) // added custom executer here otherwise using forkjoin pool
				.thenApply(result -> {
					System.out.println("Processing result in: " // thenApply return value
							+ Thread.currentThread().getName());
					return result * 2;
				}).thenAccept(finalResult -> {
					System.out.println("Final Result: " + finalResult); // thenAccept only print value
				});
		return cf;
	}
}
