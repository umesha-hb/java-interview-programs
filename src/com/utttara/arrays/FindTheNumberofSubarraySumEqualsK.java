package com.utttara.arrays;

import java.util.*;

public class FindTheNumberofSubarraySumEqualsK {

    //Uses the **Prefix Sum technique with a **Hash Map.
    public static int subarraySum(int[] arr, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1); // Important: handles exact match case
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            if (prefixMap.containsKey(sum - k)) {
                count += prefixMap.get(sum - k);//1
            }
            prefixMap.put(sum, prefixMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(subarraySum(arr, k)); // Output: 2
    }
}
