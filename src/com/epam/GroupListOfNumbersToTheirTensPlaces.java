package com.epam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListOfNumbersToTheirTensPlaces {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,15,22,81,28,31,39);
        Map<Integer, List<Integer>> groupByTens = numbers.stream()
                .collect(Collectors.groupingBy(n -> (n / 10) + 10));
        System.out.println(groupByTens);
    }

}
