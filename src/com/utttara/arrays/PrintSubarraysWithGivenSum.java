package com.utttara.arrays;

import java.util.ArrayList;

public class PrintSubarraysWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 5;
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
