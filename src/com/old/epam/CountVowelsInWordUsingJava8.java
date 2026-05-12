package com.old.epam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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
    public  static void main(String args[])
    {
        List<String> words =
                Arrays.asList("Apple", "Java", "Stream", "Interview");

        Map<String, Long> result =
                CountVowelsInWordUsingJava8.countVowels(words);
       System.out.println(result);

        Map<String, Long> collect = words.stream().collect(Collectors.toMap(e -> e,
                word -> word.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count()));
        System.out.println(collect);

    }
}

