package com.interview.epam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheDuplicateElementsInListUsingJava8Streams {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10,20,30,40,20,40,50,20);
  List<Integer> duplicateNumbers = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1)
         .map(e->e.getKey())
                .collect(Collectors.toList());
       System.out.println("duplicateNumbers="+duplicateNumbers);


    }
}
