package thread;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread running using Thread class");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread(); 
        t.start();                   
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread running using Runnable interface");
    }

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}

 class Test {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread using lambda");
        });
        t.start();
    }
}
 
 class Test1 {
	    public static void main(String[] args) {
	        Thread t = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                System.out.println("Thread using anonymous class");
	            }
	        });
	        t.start();
	    }
	}

public class CreateThread {

}
