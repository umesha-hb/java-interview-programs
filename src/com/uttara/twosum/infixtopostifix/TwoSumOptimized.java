package com.uttara.twosum.infixtopostifix;

import java.util.HashMap;
import java.util.Map;

//Optimized – O(n) using HashMap

public class TwoSumOptimized {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int delta= target - nums[i];

			if (map.containsKey(delta)) {
				return new int[] { map.get(delta), i };
			}

			map.put(nums[i], i);
		}

		return new int[] {}; // no solution found
	}


	public static void main(String[] args)
	{
		int[] nums = {2, 7, 11, 15};
		int target = 9;

		int[] result = twoSum(nums, target);
		System.out.println(result[0] + ", " + result[1]);
	} 
}
