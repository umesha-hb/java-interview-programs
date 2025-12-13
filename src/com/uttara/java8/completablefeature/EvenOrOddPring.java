package com.uttara.java8.completablefeature;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
/**
 * CompletableFeature is used for asynchronous programming in java.
 * Asynchronous programming is means writing non-blocking code by
 * running a task on seperate thread than the main application thread
 * and notifying the main thread about it progress, completion or failure
 * @author Admin
 *
 */
public class EvenOrOddPring {
	private static Object object=new Object();
	private static IntPredicate evenCond=e->e%2==0;
	private static IntPredicate oddCond=e->e%2!=0;
	public static void main(String args[]) throws InterruptedException
	{
		CompletableFuture.runAsync(()->EvenOrOddPring.printNumber(oddCond));
		CompletableFuture.runAsync(()->EvenOrOddPring.printNumber(evenCond));
		Thread.sleep(1000);
	}
	public static void printNumber(IntPredicate condition)
	{
		IntStream.rangeClosed(1, 10).filter(condition).forEach(EvenOrOddPring::execute);
	}
	
	public static void execute(int no)
	{
		synchronized (object) {
			try {
				System.out.println(Thread.currentThread().getName()+" : "+no);
				object.notify();
				object.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
