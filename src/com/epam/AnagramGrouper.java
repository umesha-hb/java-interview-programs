package com.epam;

import java.util.*;
import java.util.stream.*;

import java.util.*;
import java.util.stream.*;

public class AnagramGrouper {

    public static List<List<String>> groupAndSortAnagrams(List<String> input) {
        // Step 1: Group words by sorted-character key
        Map<String, List<String>> grouped = input.stream()
                .collect(Collectors.groupingBy(AnagramGrouper::sortedKey));
        // Step 2 & 3: Sort words inside groups and sort groups by size descending

//        grouped.values().stream()
//                .peek(Collections::sort).forEach(System.out::println); // sort
        return grouped.values().stream()
                .peek(Collections::sort) // sort words inside each group
                .sorted((a, b) -> Integer.compare(b.size(), a.size())) // sort groups by size desc
                .collect(Collectors.toList());
    }

    private static String sortedKey(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // Example usage
    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "listen", "silent", "enlist", "google", "gooegl",
                "inlets", "cat", "act", "tac", "dog"
        );

        List<List<String>> result = groupAndSortAnagrams(input);
        System.out.println(result);
    }
}
