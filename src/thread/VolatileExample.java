package thread;

class Worker extends Thread {
    //private volatile boolean running = true;
    private boolean running = true;

    public void run() {
        while (running) {
        	System.out.println("running task!!");
        }
        System.out.println("Thread stopped");
    }

    public void stopThread() {
        running = false;
    }
}

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        Worker w = new Worker();
        
        w.start();

       // Thread.sleep(1000);
        w.stopThread();
    }
}
