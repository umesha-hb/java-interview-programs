package com.utttara.arrays;

public class SubArrays {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4};
        generateSubarrays(arr);
    }

    public static void generateSubarrays(int[] arr) {
        int n = arr.length;
        int subarraySum = 10;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {

                // Print subarray from start to end
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] +" ");
                    sum += arr[k];
                }
                System.out.println();
                if (sum == subarraySum) {
                    System.out.print("[");
                    for (int i = start; i <= end; i++)
                        System.out.print(arr[i] + (i < end ? "," : ""));
                    System.out.println("]");
                }
            }
        }
    }
    public static  int maxSubArrayBrute(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

}

