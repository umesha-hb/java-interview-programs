package com.utttara.arrays;

import java.util.Arrays;

public class ArrayRotationRightOptimized {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;
         k = k % n; //Normalize k:
        reverse(arr, 0, n - 1);//1. Reverse whole array:  [7, 6, 5, 4, 3, 2, 1]
        reverse(arr, 0, k - 1);//2. Reverse first k elements:
        reverse(arr, k, n - 1);//3. Reverse rest:
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}
