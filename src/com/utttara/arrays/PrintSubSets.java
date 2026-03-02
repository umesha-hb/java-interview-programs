package com.utttara.arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int totalSubsets = 1 << n; // 2^n
        int target = 12;
        List<Integer> bestSubset = new ArrayList<>();
        int minCount = Integer.MAX_VALUE;

        for (int mask = 0; mask < totalSubsets; mask++) {
            List<Integer> subset = new ArrayList<>();
            int sum = 0;
            for (int i = 0; i < n; i++) {
              if ((mask & (1 << i)) != 0) {
                    subset.add(arr[i]);
                    sum += arr[i];
                }
            }
           System.out.println("subset="+subset+" sum="+sum);
            if (sum == target && subset.size() < minCount) {
                minCount = subset.size();
                bestSubset = subset;
            }

        }
        System.out.println("bestSubset="+bestSubset);
        // Output
        if (bestSubset.isEmpty()) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (int i = 0; i < bestSubset.size(); i++) {
                sum += bestSubset.get(i);
                System.out.print(bestSubset.get(i));
                if (i < bestSubset.size() - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + sum);
            System.out.println("Elements required = " + bestSubset.size());
        }
    }

}
