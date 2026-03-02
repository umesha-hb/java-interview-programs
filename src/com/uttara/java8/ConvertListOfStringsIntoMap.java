package com.uttara.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListOfStringsIntoMap {
    public static void main(String args[])
    {
        List<String> words = Arrays.asList("Software","Java","Collection","Learning","Learning","Stream");
        Map<String,Integer> map =
                ConvertListOfStringsIntoMap.convertToMap(words);
        System.out.println(map);
    }

    private static Map<String, Integer> convertToMap(List<String> words) {
        return words.stream().collect(Collectors.toMap(word->word,String::length,Integer::sum));
    }

}
