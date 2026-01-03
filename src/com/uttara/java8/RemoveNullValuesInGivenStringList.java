package com.uttara.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveNullValuesInGivenStringList {
    public static List<String>  removeNullValuesInGivenList(List<String> words)
    {
        return  words.stream().filter(e->Objects.nonNull(e)).collect(Collectors.toList());

    }
    public static void main(String args[])
    {
        List<String> input = Arrays.asList("Java", null, "JUnit", null);

        List<String> result =
                RemoveNullValuesInGivenStringList.removeNullValuesInGivenList(input);
        System.out.println(result);
    }
}
