package com.utttara.arrays;

/*
1. Method 1: Sum Formula
 */
public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int n = 3;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }
        int missing = expectedSum - actualSum;
        System.out.println(missing);
    }
}
