package com.utttara.arrays;

public class PrintSubsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int totalSubsets = 1 << n; // 2^n subsets

        for (int mask = 0; mask < totalSubsets; mask++) {
            System.out.print("[");
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("]");
        }
    }
}
/*
Complexity

| Type  | Complexity                                  |
| ----- | ------------------------------------------- |
| Time  | **O(n * 2^n)**                              |
| Space | **O(1)** (or O(n * 2^n) if storing subsets) |


 */

