package ipa;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) {
        // Creating a LinkedBlockingQueue with a capacity of 5
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(5);

        // Producer thread
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    blockingQueue.put(i); // Blocking operation if the queue is full
                    System.out.println("Produced: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Consumer thread
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    int value = blockingQueue.take(); // Blocking operation if the queue is empty
                    System.out.println("Consumed: " + value);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

