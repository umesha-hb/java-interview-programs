package com.utttara.arrays;

public class MaximumSumOfSubarrayOfSizeK {
    public static int maxSumUsingBruteForce(int[] arr, int k) {
        int n = arr.length;
        int max_ans = 0;
        for (int i = 0; i < n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
            }
            max_ans = Math.max(max_ans, sum);
        }
        return max_ans;
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumUsingBruteForce(arr, k));
    }

    /*
    Example

Suppose:

arr = [2, 1, 5, 1, 3, 2]
k = 3

The subarrays of size 3 are:

     */


}
