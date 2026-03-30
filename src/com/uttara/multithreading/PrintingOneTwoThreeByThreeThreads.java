package com.uttara.multithreading;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintingOneTwoThreeByThreeThreads {
    public static void main(String[] args) {

        NumberPrinter printer = new NumberPrinter();
//        Runnable r1=() -> printer.printNumbers(1);
//        Runnable r2=() -> printer.printNumbers(2);
//        Runnable r3=() -> printer.printNumbers(0);
//
//
//        Thread t1 = new Thread(r1, "Thread1");
//        Thread t2 = new Thread(r2, "Thread2");
//        Thread t3 = new Thread(r3, "Thread3");
//
//        t1.start();
//        t2.start();
//        t3.start();


        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(() -> printer.printNumbers(1),"Thread1");
        executorService.submit(() -> printer.printNumbers(2),"Thread2");
        executorService.submit(() -> printer.printNumbers(0),"Thread3");
        executorService.shutdown();

//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        CompletableFuture completableFutureOne=CompletableFuture.runAsync(r1,executorService);
//        CompletableFuture completableFutureTwo=CompletableFuture.runAsync(r2,executorService);
//        CompletableFuture completableFutureThree=CompletableFuture.runAsync(r3,executorService);
//        CompletableFuture.allOf(completableFutureOne,completableFutureTwo,
//                completableFutureThree).join();
//        executorService.shutdown();



    }
}
class NumberPrinter
{
    int number=1;
    public synchronized void printNumbers(int threadId)
    {
        while(number<20)
        {
            if(number%3!=threadId)
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
            notifyAll();
        }
    }


}

