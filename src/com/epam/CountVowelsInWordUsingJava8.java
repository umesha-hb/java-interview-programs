package com.epam;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountVowelsInWordUsingJava8 {

    public static Map<String, Long> countVowels(List<String> words) {
        return words.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> word.toLowerCase()
                                .chars()
                                .filter(c -> "aeiou".indexOf(c) != -1)
                                .count()
                ));
    }
}

