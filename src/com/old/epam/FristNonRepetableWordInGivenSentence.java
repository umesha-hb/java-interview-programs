package com.old.epam;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FristNonRepetableWordInGivenSentence {

    /*
    Given a sentence, find the first non-repeated word in a sentence using Java 8 streams

String input = "Java is fun and Java is powerful";

Expected Output - fun
     */
    public static void main(String args[])
    {
        String input = "Java is fun and Java is powerful";
        Map<String,Long> m = Stream.of(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),
                 LinkedHashMap::new,Collectors.counting()));
       String fristNonRepetableWordInGivenSentence =  m.entrySet().stream()
               .filter(e->e.getValue()==1).findFirst().get().getKey();
System.out.println("fristNonRepetableWordInGivenSentence : "+fristNonRepetableWordInGivenSentence);



      }
    public static String findFirstNonRepeatingWord(String input) {
        Map<String, Long> map =
                Stream.of(input.split(" "))
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                               LinkedHashMap::new,
                                Collectors.counting()
                        ));

        return map.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
    }


}
