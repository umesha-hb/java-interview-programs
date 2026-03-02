package com.uttara.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWord {
    public static void main(String[] args) {
        String str = "Java eight stream API makes coding enjoyableeeee";
        List<String> s = Arrays.asList(str.split("\\s"));
        String longestWord = s.stream().max(Comparator.comparing(String::length)).orElse("");
        System.out.println("longestWord -> " + longestWord);

    }
}
