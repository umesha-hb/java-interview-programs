package com.utttara.strings;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindTheLongestContinusCharctersInString {

    public static void main(String[] args) {

        String input = "aaabbccccddeeeeeeaa";

        if (input == null || input.isEmpty()) {
            System.out.println("Empty string");
            return;
        }

        char maxChar = input.charAt(0); // first char
        int maxCount = 1;//intally 1

        char currentChar = input.charAt(0);// first char
        int currentCount = 1;//intally 1

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                currentCount++;//increment
            } else {
                if (currentCount > maxCount) {//if current grater than max count
                    maxCount = currentCount;//change maxCount to  currentCount
                    maxChar = currentChar;///change maxChar to currentChar
                }
                currentChar = input.charAt(i);//overwrite currentChar inside array element
                currentCount = 1;//overwrite currentCount inside array element
            }
        }

        // Final check
        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxChar = currentChar;
        }

        System.out.println("Longest continuous character: " + maxChar);
        System.out.println("Count: " + maxCount);

    }

}

