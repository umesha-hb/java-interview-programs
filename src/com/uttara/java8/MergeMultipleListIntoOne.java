package com.uttara.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeMultipleListIntoOne {
    public static List<Integer> MergeMultipleListIntoOne(List<List<Integer>> list)
    {
        List<Integer> meregedFlattern=list.stream()
                .flatMap(e -> e.stream()).collect(Collectors.toList());
        return meregedFlattern;
    }
    public static void main(String args[])
    {
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(1, 2),
                List.of(),
                Arrays.asList(3)
        );
        System.out.println("orginalList = "+input);
        System.out.println("meregedFlattern = "+MergeMultipleListIntoOne.
                MergeMultipleListIntoOne(input));
    }
}
