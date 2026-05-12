package com.old.accionlabs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharactersOccurence {
    public static void main(String[] args) {
        String input = "microservice architecture";
        Map<String, Long> collect = Stream.of(input.split(""))
                .collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        ));
        System.out.println("map : " + collect);
        Map<Character, Integer> hs = new HashMap<>();
        //count the duplicate characters along with occurence
        char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
              hs.put(ch[i], hs.getOrDefault(ch[i],0)+1);
            }
        }
        System.out.println("map : " + hs);
        List<Map.Entry<String, Long>> duplicateCharacterList = collect.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toList());
        System.out.println("duplicateCharacterList : " + duplicateCharacterList);
    }
}
