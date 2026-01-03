package com.epam;


import java.util.Arrays;
import java.util.List;

public class FindTheShotestWordInListUsingJava8 {
    public static void main(String args[]) {

        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b); // true

        Integer x = 1000;
        Integer y = 1000;
        System.out.println(x == y); // false
List<String> list = Arrays.asList("Apple","Go","java","Stream");
int minLength = list.stream().mapToInt(String::length).max().orElse(0);
        System.out.println("minLength="+minLength);
    }
}
