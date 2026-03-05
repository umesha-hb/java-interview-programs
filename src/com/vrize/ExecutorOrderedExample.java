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

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future f1 = executor.submit(() -> printRange(1, 3));
        f1.get();  // wait for T1

        Future f2 = executor.submit(() -> printRange(4, 6));
        f2.get();  // wait for T2

        Future f3 = executor.submit(() -> printRange(7, 9));
        f3.get();  // wait for T3

        executor.shutdown();
    }

    private static void printRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}
