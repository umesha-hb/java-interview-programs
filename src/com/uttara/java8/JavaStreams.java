package com.uttara.java8;

import java.util.List;

public class JavaStreams {
    public static void main(String[] args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        list.stream()
                .filter(x -> x %2==0)
             .parallel() //Switching to parallel (NOT recommended)
                .forEach(System.out::println);
    }
}
