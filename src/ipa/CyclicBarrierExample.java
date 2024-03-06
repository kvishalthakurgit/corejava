package ipa;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    private static final int THREAD_COUNT = 5;
    private static final CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT);

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
                    barrier.await();
                    System.out.println(Thread.currentThread().getName() + " has passed the barrier.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

