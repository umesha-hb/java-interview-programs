package com.utttara.strings;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfGivenListOfWords {
    public static void main(String args[]){

        String[] words={"apple","bannana","apple","xyz","apple","bannana"};
        Map<String, Long> collect1 = Stream.of(words).collect(Collectors.groupingBy(e->e, Collectors.counting()));
    }
}
