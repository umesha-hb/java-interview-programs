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
        for (int i = 0; i <arr.length ; i++) {
            actualSum  = actualSum+arr[i];
        }
        int missing = expectedSum - actualSum;
        System.out.println(missing);
    }
}
/*
⏱ Complexity

Time Complexity → O(n) (single loop)

Space Complexity → O(1) (only two variables)
 */