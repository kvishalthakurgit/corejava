package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//execute() Method
//Accepts only Runnable
//Does NOT return anything

public class ExecutorSubmitRunnable {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(2);

//        Runnable task = () -> {
//            System.out.println("Task executed by " +
//                    Thread.currentThread().getName());
//        };

        Future<?> future = executor.submit(() -> {
            System.out.println("Task executed by " + Thread.currentThread().getName());
            Thread.sleep(1000);
            return 10 + 20;
        });
        
        Future<?> future1 = executor.submit(() -> {
            System.out.println("Task executed by " + Thread.currentThread().getName());
            Thread.sleep(1000);
            return 10 + 20;
        });
        
        executor.execute(() -> {
            System.out.println("executor Task running");
        });
        
       // while(!future.isDone()) {
        	System.out.println("Doing other work...");
        //}
        
        System.out.println("Result: " + future.get());
        System.out.println("Result: " + future1.get());
        executor.shutdown();
    }
}

