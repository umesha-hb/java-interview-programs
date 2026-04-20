package com.uttara.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueNumberInArray {
    public static void main(String args[])
    {
        int arr[]={1 ,3, 1, 3, 6, 6, 7, 10, 7};
        findUniqueNumberInArray(arr);
    }

    private static void findUniqueNumberInArray(int[] arr) {
        Integer integer = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(integer);
    }
}
