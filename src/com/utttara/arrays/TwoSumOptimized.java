package com.utttara.arrays;

import java.util.HashMap;
import java.util.Map;

//Optimized – O(n) using HashMap

public class TwoSumOptimized {
	public static void twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int delta = target - nums[i]; //9-2=7 9-7=2
			if (map.containsKey(delta)) {
				System.out.println(map.get(delta) + "," + i);//0,2
				break;
			}
			map.put(nums[i], i);//2=0
		}


	}


	public static void main(String[] args)
	{
		int[] nums = {2,7,11,15};
		int target = 9;
		twoSum(nums, target);
	} 
}
