package com.interview.mphasis;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumbersFromOneToTenUsingTwoThreads {
    public static void main(String args[])
    {
        PrintNumber printNumber = new PrintNumber();
        ExecutorService executors = Executors.newFixedThreadPool(2);
        executors.submit(()->printNumber.printNumber(1));
        executors.submit(()->printNumber.printNumber(2));
        executors.shutdown();

    }
}
class PrintNumber
{
    int number=1;
    public  synchronized  void printNumber(int threadId)
    {
        while(number<10)
        {
            while(number%threadId!=0)
            {
                try
                {
                    wait();
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }

            }
            System.out.println(Thread.currentThread().getName()+"->"+number);
            number=number+1;
            notifyAll();

        }

    }
}
