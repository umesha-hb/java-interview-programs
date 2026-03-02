package com.uttara.featureandcompletablefeature;

import java.util.concurrent.*;

public class FutureExample {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(2000);
            return 100;
        });

        System.out.println("Task submitted");

        Integer result = future.get(); // blocking

        System.out.println("Result: " + result);

        executor.shutdown();
    }
}
