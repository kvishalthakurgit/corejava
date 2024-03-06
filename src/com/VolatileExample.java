package com;

public class VolatileExample {

    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread writerThread = new Thread(() -> {
            System.out.println("Writer Thread: Setting flag to true");
            flag = true;
            try {
                Thread.sleep(20000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Writer Thread: Completed");
        });

        Thread readerThread = new Thread(() -> {
            while (!flag) {
            	System.out.println("reader is waiting");
                // Wait for the flag to become true
            }
            System.out.println("Reader Thread: Detected flag is true");
            System.out.println("Reader Thread: Completed");
        });

        // Start the threads
        writerThread.start();
        readerThread.start();

        try {
            // Wait for both threads to complete
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread: Program completed");
    }
}

