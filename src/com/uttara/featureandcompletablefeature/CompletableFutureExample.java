package com.uttara.featureandcompletablefeature;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {

        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {
                    try { Thread.sleep(2000); }
                    catch(Exception e) {}
                    return "Hello Umesha";
                });

        System.out.println("Main thread running...");

        future.thenAccept(result ->
                System.out.println("Result: " + result));

        future.join();
    }
}
