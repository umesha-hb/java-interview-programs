package com.utttara.arrays;

import java.util.HashMap;
import java.util.Map;

//Optimized – O(n) using HashMap

public class TwoSumOptimized {
	public static void twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int delta= target - nums[i];
			if (map.containsKey(delta)) {
				System.out.println(map.get(delta) + "," + i);
			}
			map.put(nums[i], i);
		}
		System.out.println(map);


	}


	public static void main(String[] args)
	{
		int[] nums = {2,1,3,8,7};
		int target = 5;
		twoSum(nums, target);
	} 
}
