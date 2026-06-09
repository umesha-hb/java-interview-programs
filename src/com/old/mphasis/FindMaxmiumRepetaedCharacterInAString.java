package com.old.mphasis;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMaxmiumRepetaedCharacterInAString {
    public static void main(String args[])
    {
        String s = "mphasismphasis";
        Map<String, Long> collect = Stream.of(s.split("")).
                collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting()));
       String longestCharacter = collect.entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        System.out.println("longestRepeated character : "+longestCharacter);

        PriorityQueue<Map.Entry<String, Long>> priorityQueue =
                new PriorityQueue<>((a, b)
                        ->b.getValue().intValue()
                        -
                        a.getValue().intValue());
        priorityQueue.addAll(collect.entrySet());
        System.out.println("repeated character : "+priorityQueue.poll());

    }
}
