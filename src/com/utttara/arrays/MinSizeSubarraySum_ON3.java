package com.utttara.arrays;
import java.util.Arrays;


public class MinSizeSubarraySum_ON3  {

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                if (sum >= target) {
                    minLen = Math.min(minLen, j - i + 1);
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(minSubArrayLen(target, nums)); // Output: 2
    }
}

