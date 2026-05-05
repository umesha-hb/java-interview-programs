package com.old.epam;


import java.util.*;

public class FindTheShotestWordInListUsingJava8 {
    public static void main(String args[]) {

        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b); // true

        Integer x = 1000;
        Integer y = 1000;
        System.out.println(x == y); // false
List<String> list = Arrays.asList("Apple","Go","java","Stream");
int minLength = list.stream().mapToInt(String::length).min().orElse(0);
        String  shortest =  list.stream().min(Comparator.comparing(String::length))
                .orElse(null);
//String  shortest="Apple";
//        for (int i = 0; i < list.size() ; i++) {
//            if(shortest.length()> list.get(i).length())
//            {
//                shortest=list.get(i);
//            }
//        }
        System.out.println("shortest : "+shortest);
    }
}
