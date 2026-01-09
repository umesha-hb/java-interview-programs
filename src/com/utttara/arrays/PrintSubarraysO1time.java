package com.utttara.arrays;

public class PrintSubarraysO1time {
    public static void printSubarrays(int[] nums, int k) {
        int left = 0, sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // Shrink window if sum exceeds k
            while (sum > k && left <= right) {
                sum -= nums[left++];
            }

            // If sum equals k, print subarray
            if (sum == k) {
                System.out.print("Subarray: ");
                for (int i = left; i <= right; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;

        printSubarrays(nums, k);
    }
}
