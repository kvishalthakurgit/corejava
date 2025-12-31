package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CFBasic {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//withoutReturn();
		//withReturn();
		
		//issueWithExecuter();
		resolveWithCompletableFuture();
	}

	private static void resolveWithCompletableFuture() {
		System.out.println("Main thread: " + Thread.currentThread().getName());

        CompletableFuture.supplyAsync(() -> {
            // Simulating large task
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 100;
        })
        .thenApply(result -> {
            System.out.println("Processing result in: " +
                    Thread.currentThread().getName());
            return result * 2;
        })
        .thenAccept(finalResult -> {
            System.out.println("Final Result: " + finalResult);
        });

        System.out.println("Main thread is NOT blocked");
	}

	private static void issueWithExecuter() throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<Integer> future = executor.submit(() -> {
		    Thread.sleep(5000); // large task
		    return 100;
		});
		System.out.println("Doing other work...");
		// ❌ BLOCKS main thread
		Integer result = future.get();
		System.out.println("Result: " + result);
		executor.shutdown();
	}

	private static void withReturn() {
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
			return 10 + 20;
		});

		future.thenAccept(result -> System.out.println("Result: " + result));

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
	}

	private static void withoutReturn() {
		CompletableFuture.runAsync(() -> {
			System.out.println("Running in: " + Thread.currentThread().getName());
		});

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
	}
}
