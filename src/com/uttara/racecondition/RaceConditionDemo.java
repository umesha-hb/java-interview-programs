package com.uttara.racecondition;

import java.util.concurrent.atomic.AtomicInteger;

//Fixing the Race Condition.
//using synchronization:
//using AtomicInteger:
class Counter {
//    AtomicInteger count = new AtomicInteger(0);
    int count=0;

    // Increment method without synchronization
    public   void increment() {
//        count.incrementAndGet();
        count++;
    }

}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that increment the counter 1000 times each
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                    counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                        counter.increment();
            }
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final count
        System.out.println("Final count: " + counter.count);
    }
}
