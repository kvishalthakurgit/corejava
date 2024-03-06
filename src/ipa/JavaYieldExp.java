package ipa;

public class JavaYieldExp extends Thread
{
    public void run()
    {
        for (int i=0; i<30 ; i++)
            System.out.println(Thread.currentThread().getName() + " in control");
    }
    public static void main(String[]args)
    {
        JavaYieldExp t1 = new JavaYieldExp();
        JavaYieldExp t2 = new JavaYieldExp();
        // this will call run() method
        t1.start();
        t2.start();
        
        //here t1 allowing other thread to start
        t1.yield();
        
    }
}
