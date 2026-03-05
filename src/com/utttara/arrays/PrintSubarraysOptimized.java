package com.utttara.arrays;

public class PrintSubarraysOptimized {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            StringBuilder sb = new StringBuilder();

            for (int end = start; end < n; end++) {
                sb.append(arr[end]).append(" ");
                System.out.println(sb.toString());
            }
        }
    }
}

/*
⏱ Complexity

Time Complexity → O(n2) (2 nested loops.)

Space Complexity → O(n) (Because StringBuilder can grow up to size n.)
 */