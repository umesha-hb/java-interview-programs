package com.epam;

import java.util.Arrays;
import java.util.List;

public class CalculateProductOfAllNumbersInAIntegerList {
    public static Integer calculateProduct(List<Integer> numbers) {
        return numbers.stream().reduce(1, (a, b) -> a * b);
    }
}
