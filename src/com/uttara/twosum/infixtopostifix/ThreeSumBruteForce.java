package com.uttara.twosum.infixtopostifix;

import java.util.*;

public class ThreeSumBruteForce {

    public static List<List<Integer>> findTriplets(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == target) {
                        List<Integer> triplet =
                                Arrays.asList(nums[i], nums[j], nums[k]);
                        System.out.println(triplet);

                        // Sort to avoid duplicate triplets
//                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }
    public static void main(String args[]){
        int nums[]= {12, 3, 4, 1, 6, 9};
        int taget=24;
        System.out.println(findTriplets(nums,taget));
    }
}

