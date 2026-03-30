package com.epam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArraysIntoSingleMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ankit", "Neha", "Aman");
        List<Integer> id = Arrays.asList(101, 202, 303);
        Map<String, Integer> result = IntStream.range(0, names.size())
                .boxed()
                .collect(Collectors.toMap(names::get, id::get));
        System.out.println(result);
    }
}
