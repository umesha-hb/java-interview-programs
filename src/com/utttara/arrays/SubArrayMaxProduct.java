package com.utttara.arrays;

import java.util.ArrayList;
/*
Example 1:
Input: nums = [2, 3, -2, 4]
Output: 6
Explanation: The subarray [2, 3] yields the maximum product, which is 6.

Example 2:
Input: nums = [-2, 0, -1]
Output: 0
Explanation: Even though [-2, -1] multiplies to 2, it is not contiguous, so the maximum contiguous product is 0.
-2
 */
public class SubArrayMaxProduct {
    public static void main(String[] args) {
        int arr[] = {-2, 0, -1};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int mul = 1;
                for (int k = start; k <= end; k++) {
                    mul = mul * arr[k];
                    System.out.print(" " + arr[k]);
                }
                al.add(mul);
                System.out.println(" "+mul);
            }
        }
        int max = al.stream().mapToInt(Integer::intValue).max().stream().findFirst().orElse(0);
        System.out.println(max);

    }
}
