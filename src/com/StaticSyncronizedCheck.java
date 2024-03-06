package com;

class Table{
	static int num = 10;
	 synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     int j = n*i;
		System.out.println(Thread.currentThread().getName()+"=="+ num);
	     num = num+10;
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
	}  
	class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	}  
	  
	public class StaticSyncronizedCheck{  
	public static void main(String args[]){  
	Table obj = new Table();
	Table obj1 = new Table();//only one object  
	MyThread1 t1=new MyThread1(obj);  
	MyThread2 t2=new MyThread2(obj);  
	t1.start();  
	t2.start();  
	MyThread1 t3=new MyThread1(obj1);  
	MyThread2 t4=new MyThread2(obj1);
	t3.start();  
	t4.start();  
	}  
	}  
