package com.mphasis;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Number
{
    int number=0;
    public  synchronized  void printTail()
    {
        while(number<10)
        {
            if(number%2!=0)
            {
                try
                {
                    wait();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println("Tail :");
            number = number+1;
            notify();
        }
    }
    public synchronized  void printHead() {
        while (number < 10)
        {
            if (number % 2 == 0)
            {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Head : ");
            number = number + 1;
            notify();
        }
    }

}
public class Tester
{
    public static void main(String args[])
    {
        Number number = new Number();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()->number.printHead());
        executorService.submit(()->number.printTail());
        executorService.shutdown();
    }

}
