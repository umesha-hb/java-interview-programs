package com.utttara.strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String args[]) {
//        Map<String, List<String>> map = new HashMap<>();
        String input[] = {"eat","tea","tan","ate","nat","bat"};
        Map<String,List<String>> map = new HashMap<>();

        for(String s : input){

            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
        System.out.println(map.values());
        map.values().stream()
                .peek(Collections::sort).forEach(System.out::println);
        map.values().stream()
                .peek(Collections::sort)
                .sorted((a,b)->a.size()-b.size()).forEach(System.out::println);



    }
}
