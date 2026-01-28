package com.utttara.arrays;

import java.util.Arrays;

public class ArrayRotationOptimized {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        System.out.println("Original Array : " + Arrays.toString(arr));
        int k = 3;
        k = k % n;
        reverseHelper(arr, 0, k - 1);
         reverseHelper(arr, k, n - 1);
       reverseHelper(arr, 0, n - 1);
        System.out.println("Rotated Array : " + Arrays.toString(arr));
    }

    private static void reverseHelper(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
