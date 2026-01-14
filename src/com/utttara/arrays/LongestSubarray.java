package com.utttara.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    public static int longestSubarray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            // If entire array till i sums to k
            if (sum == k) {
                 maxLen = i + 1;
            }

            // If (sum - k) seen before
            if (map.containsKey(sum - k)) {

                maxLen = Math.max(maxLen, i - map.get(sum - k));
                System.out.println("i : "+i);
            }

            // Store first occurrence only
            map.putIfAbsent(sum, i);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        System.out.println(longestSubarray(arr, k));
    }
}
