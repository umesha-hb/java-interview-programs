package com.uttara.datastructure;
/*
A pivot element in an array is an element
where the sum of all elements to its left is equal to the sum of all elements to its right.
 */
public class PivotElement {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i; // pivot index
            }
            leftSum += nums[i];
        }
        return -1; // no pivot
    }

}
