package com.uttara.persistent;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {
        String input = "zzdddssaaaaabbbabbbccc";

        String result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getValue() + "" + e.getKey())
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
