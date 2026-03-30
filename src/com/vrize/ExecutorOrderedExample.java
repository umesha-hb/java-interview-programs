package com.vrize;

/*
Java program where:

T1 prints → 1, 2, 3

T2 prints → 4, 5, 6

T3 prints → 7, 8, 9

Output should be in strict order
 */
import java.util.concurrent.*;

public class ExecutorOrderedExample {

//    public static void main(String[] args) throws Exception {
//
//        ExecutorService executor = Executors.newFixedThreadPool(3);
//
//        Future f1 = executor.submit(() -> printRange(1, 3));
//        f1.get();  // wait for T1
//
//        Future f2 = executor.submit(() -> printRange(4, 6));
//        f2.get();  // wait for T2
//
//        Future f3 = executor.submit(() -> printRange(7, 9));
//        f3.get();  // wait for T3
//
//        executor.shutdown();
//    }
//
//
//    private static void printRange(int start, int end) {
//        for (int i = start; i <= end; i++) {
//            System.out.print(i + " ");
//        }
    public static void main(String[] args)
    {
//        PrintNumber printNumber = new PrintNumber();
//      +
//        Runnable r2 = ()->printNumber.printOddNumbers();;
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//        t1.start();
//        t2.start();

//    ExecutorService executorService = Executors.newFixedThreadPool(2);
//    PrintNumber printNumber = new PrintNumber();
//    executorService.submit(()->printNumber.printOddNumbers());
//        executorService.submit(()->printNumber.printEvenNumbers());
//       executorService.shutdown();

//        PrintNumber printNumber = new PrintNumber();
//        CompletableFuture completableFutureOdd = CompletableFuture.runAsync(()-> printNumber.printOddNumbers());
//        CompletableFuture completableFutureEven = CompletableFuture.runAsync(()-> printNumber.printEvenNumbers());
//        CompletableFuture.allOf(completableFutureOdd,completableFutureEven).join();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        PrintNumber printNumber = new PrintNumber();
        CompletableFuture completableFutureOdd = CompletableFuture.runAsync(()-> printNumber.printOddNumbers(),executorService);
        CompletableFuture completableFutureEven = CompletableFuture.runAsync(()-> printNumber.printEvenNumbers(),executorService);
        CompletableFuture.allOf(completableFutureOdd,completableFutureEven).join();
       executorService.shutdown();


    }
   }

class PrintNumber
{
    int number=1;
    public synchronized void printOddNumbers()
    {
        while(number<20)
        {
            while(number%2==0)
            {
                try
                {
                    wait();
                }
                catch (InterruptedException e)
                {
                   e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"->"+number);
            number=number+1;
            notify();
        }
    }
    public synchronized void printEvenNumbers()
    {
        while(number<20)
        {
            while(number%2!=0)
            {
                try
                {
                    wait();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"->"+number);
            number=number+1;
            notify();
        }
    }

}