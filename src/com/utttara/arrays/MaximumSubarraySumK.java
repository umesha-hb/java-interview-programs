package com.utttara.arrays;

public class MaximumSubarraySumK {
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
        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(maxSumUsingBruteForce(arr, k));
    }


}
