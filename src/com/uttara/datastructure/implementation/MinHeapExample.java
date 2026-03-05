package com.uttara.datastructure.implementation;

import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
