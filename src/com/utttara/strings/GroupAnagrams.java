package com.utttara.strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {
    public static void main(String args[]) {
//        Map<String, List<String>> map = new HashMap<>();
        String input[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("==using map group the anagrams==");
        Map<String,List<String>> map  =
                Arrays.stream(input)
                        .collect(Collectors.groupingBy(s -> {
                            char[] arr = s.toCharArray();
                            Arrays.sort(arr);
                            return new String(arr);
                        }));
        System.out.println(map);
        for (List<String> group : map.values()) {
            Collections.sort(group);
        }


        System.out.println(map.values());
        System.out.println("sort the groups based on size");
        System.out.println(map.values().stream()
                .sorted((a,b)->a.size()-b.size())
                .collect(Collectors.toList()));
    }
}
