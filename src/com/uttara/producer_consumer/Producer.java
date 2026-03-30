package com.uttara.producer_consumer;

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        int value = 0;
        try {
            while (true) {
                queue.put(value); // blocks if full
                System.out.println("Produced: " + value++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
         e.printStackTrace();
        }
    }
}