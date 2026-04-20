package com.interview.epam;

import java.util.Arrays;
import java.util.List;

public class CalculateProductOfAllNumbersInAIntegerList {
    public static Integer calculateProduct(List<Integer> numbers) {
        return numbers.stream().reduce(1, (a, b) -> a * b);

    }
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(CalculateProductOfAllNumbersInAIntegerList.
                calculateProduct(list));
    }
}
