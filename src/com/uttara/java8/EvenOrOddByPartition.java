package com.uttara.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOddByPartition {
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
         System.out.println("Even Numbers : "+map.get(true));
        System.out.println("Odd Numbers : "+map.get(false));
    }
}
