package com.paypal;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class kFrequentElements {
    public static void main(String args[]) {
        Integer[] elements = {1,1,1,2,2,3};
        int k = 2;
        findKFrequentElement(elements, k);
    }

    private static void findKFrequentElement(Integer[] elements, int k) {
        Map<Integer, Long> map = Arrays.asList(elements).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //        List<Integer> list = map.entrySet().stream().
        //                sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
        //                .limit(k)
        //                .map(Map.Entry::getKey)
        //                .collect(Collectors.toList());
        //        System.out.println("list : "+list);

        PriorityQueue<Map.Entry<Integer, Long>> priorityQueue =
                new PriorityQueue<>((a, b) -> b.getValue().intValue() - a.getValue().intValue());
        priorityQueue.addAll(map.entrySet());
        int count = 0;
        while (count < k) {
            System.out.println(priorityQueue.poll().getKey());
            count++;
        }


    }

}


