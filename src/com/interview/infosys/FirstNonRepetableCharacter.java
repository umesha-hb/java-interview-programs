package com.interview.infosys;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepetableCharacter
{
    public static void main(String[] args)
    {
        /*
        find first non repeating character
    input-> str="aabbcdeff";
    output should be -> c
         */
        String str="aabbcdeff";
        Arrays.asList(str.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).limit(1)
                .map(Map.Entry::getKey).forEach(System.out::println);
    }
}
