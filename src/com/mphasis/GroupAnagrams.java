package com.mphasis;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {
    public static void main(String args[])
    {
        List<String> al = Arrays.asList("eat","tea","tan","ate","nat","bat");
        Map<String, List<String>> collect = al.stream().collect(Collectors.groupingBy(GroupAnagrams::sortkey));
        System.out.println(collect.values());
        System.out.println("sort the words inside group");
        for (List<String> group : collect.values())
        {
            Collections.sort(group);
        }
        System.out.println(collect.values());
        System.out.println("sort the groups based on size");
        List sorted = collect.values().stream().sorted((e1, e2) -> e1.size() - e2.size())
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
    public static String sortkey(String word)
    {
        char[] arr=word.toCharArray();
        Arrays.sort(arr);
//        Stream.of(word.split("")).sorted().collect(Collectors.joining());
        return new String(arr);
    }
}
