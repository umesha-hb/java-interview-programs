package com.uttara.multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintingOneTwoThreeByThreeThreads {
    public static void main(String[] args) {

        NumberPrinter printer = new NumberPrinter();

        Thread t1 = new Thread(() -> printer.printNumbers(1), "Thread1");
        Thread t2 = new Thread(() -> printer.printNumbers(2), "Thread2");
        Thread t3 = new Thread(() -> printer.printNumbers(0), "Thread3");
        t1.start();
        t2.start();
        t3.start();

//        NumberPrinter printer = new NumberPrinter();
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        executorService.submit(()->printer.printNumbers(1),"Thread1");
//        executorService.submit(()->printer.printNumbers(2),"Thread2");
//        executorService.submit(()->printer.printNumbers(0),"Thread3");
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
            while(number%3!=threadId)
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

