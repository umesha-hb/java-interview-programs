package com.utttara.arrays;

import java.util.ArrayList;

public class PrintSubarraysWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int k = 6;
        printSubarraysWithGivenSum(arr, k);
    }

    private static void printSubarraysWithGivenSum(int[] arr, int k) {

        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum = sum + arr[end];
                    for (int i = start; i <= end; i++) {
                      if (sum == k) {
                            System.out.print(arr[i] + " ");

                        }
                    }
                    System.out.println();
            }
        }

    }
}
