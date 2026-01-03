package com.uttara.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckIfTwoStringsAreAnagrams {
    public static void main(String args[]) {
        String s1 = "listen";
        String s2 = "silent";
        boolean isAnagram = Stream.of(s1.split("")).sorted().collect(Collectors.joining()).equals(Stream.of(s2.split("")).sorted().collect(Collectors.joining()));
        System.out.println("isAnagram=" + isAnagram);
    }
}
