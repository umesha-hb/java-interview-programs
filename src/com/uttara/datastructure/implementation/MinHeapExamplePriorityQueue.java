package com.uttara.datastructure.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MinHeapExamplePriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> al = Arrays.asList(1,8,1,2,2,2,3,3,4,5,6,6,6,6);
        pq.addAll(al);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
