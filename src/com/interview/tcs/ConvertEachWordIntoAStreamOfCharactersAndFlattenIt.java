package com.interview.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertEachWordIntoAStreamOfCharactersAndFlattenIt {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<Character> result = words.stream()
                .flatMap(e -> e.chars()
                        .mapToObj(c -> (char) c)
                ).collect(Collectors.toList());
        System.out.println(result);

//        Without Streams (Traditional Loops)
        List<Character> result1 = new ArrayList<>();
        for(String word : words){
            for(char c : word.toCharArray()){
                result1.add(c);
            }
        }
        System.out.println(result1);
    }
}
/*
Explanation

words.stream() → converts list into stream.

word.chars() → returns IntStream of character ASCII values.

mapToObj(c -> (char) c) → converts each int to Character.

flatMap(...) → merges all character streams into one.

collect(Collectors.toList()) → collects result into list.
 */
