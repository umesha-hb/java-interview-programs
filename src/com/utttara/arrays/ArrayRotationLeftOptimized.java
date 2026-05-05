package com.utttara.arrays;

import java.util.Arrays;

public class ArrayRotationLeftOptimized {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;
       k = k % n; //Normalize k:
        reverseHelper(arr, 0, k - 1);//1. Reverse first k: [3, 2, 1, 4, 5, 6, 7]
         reverseHelper(arr, k, n - 1);//2. Reverse rest:  [3, 2, 1, 7, 6, 5, 4]
       reverseHelper(arr, 0, n - 1);//3. Reverse whole array:  [4, 5, 6, 7, 1, 2, 3]
        System.out.println(Arrays.toString(arr));
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
/*
Complexity Analysis

    Time Complexity
        First reverse → O(k)
        Second reverse → O(n-k)
        Third reverse → O(n)
    Total: O(k + (n-k) + n) = O(n)

    Space Complexity
        Only a few variables.
    O(1)

 */