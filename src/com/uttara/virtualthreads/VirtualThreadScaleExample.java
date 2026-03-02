package com.uttara.virtualthreads;

import java.util.concurrent.*;
/*
Massive Scalability Demo
 */
public class VirtualThreadScaleExample {

    public static void main(String[] args) {

        try (ExecutorService executor =
                     Executors.newVirtualThreadPerTaskExecutor()) {
//Starting from Java 7,
// you can use underscores (_) in numeric literals to improve readability.
            for (int i = 0; i < 100_000; i++) {
                executor.submit(() -> {
                    Thread.sleep(1000); // blocking call
                    return null;
                });
            }
        }
    }
}

