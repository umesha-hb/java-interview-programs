package com.uttara.java8;

import java.util.Arrays;
import java.util.List;

public class CalculateAverageNumberFromList {
    public static void main(String args[])
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

       double average =
               CalculateAverageNumberFromList.averageFromList(numbers);
        System.out.println(average);
    }
    public static Double averageFromList(List<Integer> numbers) {
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        return average;
    }
}
