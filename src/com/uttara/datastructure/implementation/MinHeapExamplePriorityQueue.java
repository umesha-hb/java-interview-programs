package com.uttara.datastructure.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MinHeapExamplePriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        List<Integer> al = Arrays.asList(1,8,1,2,2,2,3,3,4,5,6,6,6,6);
        pq.addAll(al);
        int k=1;
        int count=0;

        while (count<k) {
            System.out.println(pq.poll());
            count++;
        }
    }
}
