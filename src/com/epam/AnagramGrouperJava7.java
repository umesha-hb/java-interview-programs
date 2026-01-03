package com.epam;

import java.util.*;
/*
Given a list of words, group them by anagrams,
 and sort the groups by the frequency (descending) of words in each group.
Within each group, sort the words in ascending order.

Input example:
List<String> input = Arrays.asList(
 "listen", "silent", "enlist", "google", "gooegl", "inlets", "cat", "act", "tac", "dog"
);

Expected output:
[
 [enlist, inlets, listen, silent],    // 4 words
 [act, cat, tac],                     // 3 words
 [google, gooegl],                   // 2 words
 [dog]                                // 1 word
]
 */
public class AnagramGrouperJava7 {

    public static List<List<String>> groupAndSortAnagrams(List<String> input) {

        // Step 1: Group by sorted-character key
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for (String word : input) {
            String key = sortChars(word);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(word);
        }

        // Step 2: Sort words inside each group
        for (List<String> group : map.values()) {
            Collections.sort(group);
        }

        // Step 3: Convert map values to list
        List<List<String>> result = new ArrayList<List<String>>(map.values());

        // Step 4: Sort groups by size (descending), tie-break by first word
        Collections.sort(result, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> a, List<String> b) {
                int sizeCompare = b.size() - a.size();
                if (sizeCompare != 0) {
                    return sizeCompare;
                }
                return a.get(0).compareTo(b.get(0));
            }
        });

        return result;
    }

    private static String sortChars(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // Demo
    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "listen", "silent", "enlist", "google",
                "gooegl", "inlets", "cat", "act", "tac", "dog"
        );

        List<List<String>> result = groupAndSortAnagrams(input);

        System.out.println(result);
    }
}
