package com.interview.epam;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordIn_a_Sentence_Java8_streams {
    public static void main(String[] args)
    {
        String str="Java Streams are Powerful";
        String reverseString = Stream.of(str.split(" ")).
                map(e->new StringBuffer(e).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("reversed words in another string = "+reverseString);
    }
}
