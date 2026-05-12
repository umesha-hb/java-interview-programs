package com.utttara.arrays;

public class MissingCharacter {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'e'};
        int n = arr.length;
        int expectedSum = 0;
        for (char c = 'a'; c <= 'e'; c++) {
            expectedSum += c;
        }
        System.out.println(expectedSum);
        int actualSum = 0;
        for (char num : arr) {
            actualSum += num;
        }
        System.out.println(actualSum);
        System.out.println(expectedSum - actualSum);
        char missing = (char) (expectedSum - actualSum);
        System.out.println(missing);


    }
}
