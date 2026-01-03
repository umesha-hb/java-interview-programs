package com.uttara.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NthLargestNumber {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(70, 90, 80, 40, 50, 60, 10, 30, 20);
       int nthLargerestNumber =  list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElseThrow();
        System.out.println(nthLargerestNumber);
    }
}
