package com.utttara.arrays;

import java.util.ArrayList;

public class MinimumSubarray {

    public static int minSubArray(int[] nums) {
        int minSoFar = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSoFar = Math.min(minSoFar, currentMin);
        }

        return minSoFar;
    }
/*
Given an integer array, find the contiguous subarray that has the smallest sum.
 2 sum=2
    2 3 sum=5
    2 3 -2 sum=3
    2 3 -2 4 sum=7
    3 sum=3
    3 -2 sum=1
    3 -2 4 sum=5
    -2 sum=-2<-------------------------smallest sum
    -2 4 sum=2
    4 sum=4
 */
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(minSumUsingBruteForce(nums)); // -6
    }
    public static int minSumUsingBruteForce(int[] nums) {
        int arr[] =nums;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int sum = 0;

                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k]+" ");

                }
                System.out.println("="+sum);
                al.add(sum);
            }
        }
        int min = al.stream().mapToInt(Integer::intValue).min().stream().findFirst().orElse(0);
        return min;
    }
}
