package com.paypal;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequent {
    public static List<Integer> topK(int[] nums, int k) {
        Map<Integer, Long> map = Arrays.stream(nums).boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        PriorityQueue<Map.Entry<Integer,Long>> pq =
                new PriorityQueue<>((a,b)
                        -> b.getValue().intValue()-a.getValue().intValue());
        pq.addAll(map.entrySet());

        List<Integer> result = new ArrayList<>();
        int count=0;
        while(count<k){
            result.add(pq.poll().getKey());
            count++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,4,5,6,6,6,6};

        System.out.println(topK(arr,2));
    }
}
