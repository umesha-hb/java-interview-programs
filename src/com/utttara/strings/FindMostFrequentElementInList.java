package com.utttara.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostFrequentElementInList {
    public static void main(String args[]) {

        //Without Streams
        List<Integer> list = Arrays.asList(1, 1, 1, 2, 2, 3);
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxCount = 0;
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();

            }
        }

        System.out.println(result + "=" + maxCount);


        //java8  Stream API
        Integer resul =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                        .orElse(null);
        System.out.println(resul);
    }
}

