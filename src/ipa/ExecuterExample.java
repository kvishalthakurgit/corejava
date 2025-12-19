package ipa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;  

class MyWorkerThread implements Runnable {  
    private String message;  
    public MyWorkerThread(String s){  
        this.message=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
    }  
    private void processmessage() {  
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }  
}  



public class ExecuterExample {
	 public static void main(String[] args) {  
	        ExecutorService executor = Executors.newFixedThreadPool(10);//creating a pool of 5 threads
	        for (int i = 1; i < 10; i++) {  
	            Runnable worker = new MyWorkerThread("" + i);  
	            executor.execute(worker);//calling execute method of ExecutorService  
	          }  
	        executor.shutdown();  
	        while (!executor.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");  
	    }  
}

