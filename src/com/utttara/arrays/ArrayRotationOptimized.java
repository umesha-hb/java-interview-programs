package com.utttara.arrays;

import java.util.Arrays;

public class ArrayRotationOptimized {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int numberofrotation = 3;
       numberofrotation = numberofrotation % n;
        reverseHelper(arr, 0, numberofrotation - 1);
         reverseHelper(arr, numberofrotation, n - 1);
       reverseHelper(arr, 0, n - 1);

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