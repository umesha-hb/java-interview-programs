package com.uttara.virtualthreads;

import java.util.concurrent.*;
/*
Massive Scalability Demo
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadScaleExample {

    public static void main(String[] args) throws InterruptedException {

        //Starting from Java 7,
// you can use underscores (_) in numeric literals to improve readability.
        int tasks = 100_000;

        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 0; i < tasks; i++) {
                int taskId = i;

                executor.submit(() -> {
                    try {
                        Thread.sleep(1000); // simulate IO work
                        System.out.println("Task " + taskId +
                                " executed by " + Thread.currentThread());
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        }

        System.out.println("All tasks submitted");
    }
}

