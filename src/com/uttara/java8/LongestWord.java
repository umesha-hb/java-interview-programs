package com.uttara.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWord {
    public static void main(String[] args) {
        String str = "Java eight stream API makes coding enjoyableeeee";
        List<String> s = Arrays.asList(str.split(" "));
        String longestWord = s.stream().max(Comparator.comparing(String::length)).orElse("");
        System.out.println("longestWord -> " + longestWord);
        findLongestWord(str.split(" "));

    }

     static void  findLongestWord(String[] words)
     {
         String longest=words[0];
         for (int i = 1; i < words.length ; i++)
         {
             if(longest.length()<words[i].length())
             {
                 longest = words[i];
             }
         }
         System.out.println("longest -> " + longest);
     }
}
