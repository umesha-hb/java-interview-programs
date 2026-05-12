package com.old.mindpec;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKfrequentElement {
    public static void main(String args[]) {
        int arr[]={1,2,1,2,1,2,3,1,3,2,5,5,5,5,5,5};
        Map<Integer,Integer> map = new HashMap();
        for(int i =0;i<arr.length;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);

        }
        System.out.println(map);
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        priorityQueue.addAll(map.entrySet());
        int k=2;
        int count=0;
        while(count<k&&!priorityQueue.isEmpty())
        {
            System.out.println(priorityQueue.poll().getKey());
            count++;
        }
    }
}
