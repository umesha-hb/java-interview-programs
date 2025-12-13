package com.uttara.multithrading;

public class SyncDemo 
{
 public static void main(String args[])
 {
	 Counter c = new Counter();
	 Thread t1 = new Thread(()->{
		 for (int i = 0; i < 100000; i++)
			c.increment();
	 });
	 Runnable r = ()->{
		 for (int i = 0; i < 100000; i++)
				c.increment();
	 };
	 Thread t2 = new Thread(r);
	 
	 
	 t1.start();
	 t2.start();
	 
	 try {
		t1.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	

	 try {
		t2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 System.out.println("count : "+c.count);
	 
 }
}
class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}
