package com.utttara.arrays;

import java.util.ArrayList;
//This is the famous Kadane’s Algorithm.
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
// Example:
//     nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//
//     Initialization
//             maxSoFar = -2
//     currentMax = -2
//
//     Iteration Trace
//
//             | i | nums[i] | currentMax = max(nums[i], currentMax + nums[i]) | maxSoFar |
//             | - | ------- | ----------------------------------------------- | -------- |
//             | 0 | -2      | -2                                              | -2       |
//             | 1 | 1       | max(1, -2+1 = -1) = 1                           | max(-2,1) =1       |
//             | 2 | -3      | max(-3, 1-3 = -2) = -2                          | max(1,-2) =1         |
//             | 3 | 4       | max(4, -2+4 = 2) = 4                            | max(1,4) =4        |
//             | 4 | -1      | max(-1, 4-1 = 3) = 3                            | max(4,3) =4       |
//             | 5 | 2       | max(2, 3+2 = 5) = 5                             | max(4,5) =5       |
//             | 6 | 1       | max(1, 5+1 = 6) = 6                             | max(5,6) =6        |
//             | 7 | -5      | max(-5, 6-5 = 1) = 1                            | max(6,1) =6       |
//             | 8 | 4       | max(4, 1+4 = 5) = 5                             | max(6,5) =6       |


    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums)); // 7
    }

    public static int maxSumUsingBruteForce(int[] nums) {
        int arr[] = nums;
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

/*
⏱ Complexity

Time Complexity → O(n) (single loop)

Space Complexity → O(1) (only two variables)
 */
