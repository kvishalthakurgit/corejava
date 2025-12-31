package thread;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    int count = 0;  
    
    AtomicInteger aCount = new AtomicInteger(0);

    void increment() {
        count++;
    }
    
    synchronized void increment1() {
    		count++;
    }
    
    void increment2() {
    	aCount.incrementAndGet();
    }
}

public class ThreadSharingResource {
	public static void main(String[] args) throws InterruptedException {
		Counter c1 = new Counter();
		
		Thread t1 = new Thread(()->{
			for (int i = 0; i < 1000; i++) {
	            //c1.increment();
	            //c1.increment1();
	            c1.increment2();
	        }
		});
		
		Thread t2 = new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				//c1.increment();
	            //c1.increment1();
	            c1.increment2();
	        }
		});
		
		t1.start();
		t2.start();
		
        t1.join();
        t2.join();
		System.out.println("Final Count1: " + c1.count);
		System.out.println("Final Count1: " + c1.aCount);
	}
}
