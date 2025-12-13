package com.uttara.java8.completablefeature;

public class EvenOrOddPrintThread implements Runnable{

	Object object;
	static int i=1;
	public EvenOrOddPrintThread(Object object)
	{
		this.object=object;
	}
	
	public static void main(String[] args) {
		Object object = new Object();
		Runnable th1=new EvenOrOddPrintThread(object);
		Runnable th2=new EvenOrOddPrintThread(object);
		new Thread(th1,"even").start();
		new Thread(th2,"odd").start();
		

	}

	@Override
	public void run() {
		while(i<=10)
		{
			if(i%2==0 && Thread.currentThread().getName().equals("even") ) {
				synchronized (object) {
					System.out.println(Thread.currentThread().getName()+" : "+i);
					i++;
					try {
						object.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if(i%2!=0 && Thread.currentThread().getName().equals("odd") ) {
				synchronized (object) {
					System.out.println(Thread.currentThread().getName()+" : "+i);
					i++;
					object.notify();
					}
				}
			}
		}
		
	}


