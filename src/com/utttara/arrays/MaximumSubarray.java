package com.utttara.arrays;

import java.util.ArrayList;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];//minSoFor     2
        int currentMax = nums[0];//currentMin 2

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);//minSoFor //5 5
        }

        return maxSoFar;
    }

    /*
  Given an integer array, find the contiguous subarray that has the largest sum..
    2 sum=2
    2 3 sum=5
    2 3 -2 sum=3
    2 3 -2 4 sum=7<----------------largest sum..
    3 -2 sum=1
    3 -2 4 sum=5
    -2 sum=-2
    -2 4 sum=2
    4 sum=4
     */
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxSubArray(nums)); // 7
    }

    public static int maxSumUsingBruteForce(int[] nums) {
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
        int max = al.stream().mapToInt(Integer::intValue).max().stream().findFirst().orElse(0);
        return max;
    }
}

