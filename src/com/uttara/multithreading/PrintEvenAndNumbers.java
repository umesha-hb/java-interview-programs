package com.uttara.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintEvenAndNumbers {
    public static void main(String args[])
    {
        //Thread objects manually
//        PrintNumber printNumber = new PrintNumber();
//        Runnable r1=()->printNumber.printEven();
//        Runnable r2=()->printNumber.printOdd();
//        Thread t1=new Thread(r1);
//        Thread t2=new Thread(r2);
//        t1.start();
//        t2.start();

        //Using ExecutorService
        PrintNumber printNumber = new PrintNumber();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> printNumber.printEven());
        executor.submit(() -> printNumber.printOdd());
        executor.shutdown();

        /*
        We use ExecutorService to manage threads through a thread pool. Instead of creating Thread objects,
        we submit tasks (printOdd and printEven) to the executor, which assigns them to worker threads and handles lifecycle management.
         */

        //Using CompletableFuture without ExecutorService
//        PrintNumber printNumber = new PrintNumber();
//        CompletableFuture oddFuture = CompletableFuture.runAsync(()-> printNumber.printOdd());
//        CompletableFuture evenFeature = CompletableFuture.runAsync(()->printNumber.printEven());
//        CompletableFuture.allOf(oddFuture,evenFeature).join();

         /*
        If you do not provide an executor, Java uses the common pool of ForkJoinPool.

        Difference
        | Feature            | Without ExecutorService | With ExecutorService |
        | ------------------ | ----------------------- | -------------------- |
        | Thread pool        | ForkJoin common pool    | Custom pool          |
        | Performance tuning | No                      | Yes                  |
        | Resource control   | No                      | Yes                  |
        | Production systems | Not recommended         | Recommended          |

        When we use CompletableFuture without an executor, tasks run in the ForkJoinPool common pool.
        When we pass an ExecutorService, tasks run in a custom thread pool, giving us better control over thread management,
        scalability, and performance.

         */

        //Using CompletableFuture with ExecutorService (Best Practice)
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        PrintNumber printer = new PrintNumber();
//        CompletableFuture<Void> oddFuture =
//                CompletableFuture.runAsync(() -> printer.printOdd(), executor);
//        CompletableFuture<Void> evenFuture =
//                CompletableFuture.runAsync(() -> printer.printEven(), executor);
//        CompletableFuture.allOf(oddFuture, evenFuture).join();
//        executor.shutdown();


    }

}
class PrintNumber
{
    int number=1;
    public synchronized void printEven()
    {
        while (number<20) {
            if (number % 2 == 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even :"+number);
            number = number+1;
            notify();
        }
    }
    public synchronized void printOdd()
    {
        while(number<20) {
            if (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Odd :"+number);
            number = number+1;
            notify();
        }
    }
}