package com.utttara.arrays;

import java.util.*;

public class SubarraySumK {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1); // Important: handles exact match case
         int sum = 0;
         int count = 0;
         for (int num : nums)
         {
             sum += num;
             if (prefixMap.containsKey(sum - k))
             {
                 count += prefixMap.get(sum - k);
             }
             prefixMap.put(sum, prefixMap.getOrDefault(sum, 0) + 1);
         }
         return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;

        System.out.println(subarraySum(nums, k)); // Output: 2
    }

    /* trace
    Initial State
	prefixMap = {0=1}
	sum = 0
	count = 0
Iteration 1 (num = 1)
	sum = sum + num = 0 + 1 = 1
	sum - k = 1 - 2 = -1
	Is -1 in map? ❌ No
	Now update map:
	prefixMap.put(1, 1)
	Map now:{0=1, 1=1}

🔹 Iteration 2 (num = 1)
	sum = 1 + 1 = 2
	sum - k = 2 - 2 = 0
	Is 0 in map? ✅ Yes (frequency = 1)
	So:
	count = 0+1 = 1
	Now update map:
	prefixMap.put(2, 1)
	Map now:
	{0=1, 1=1, 2=1}

🔹 Iteration 3 (num = 1)
	sum = 2 + 1 = 3
	sum - k = 3 - 2 = 1
	Is 1 in map? ✅ Yes (frequency = 1)
	count = 1+1 = 2
	Now update map:
	prefixMap.put(3, 1)
	Map now:
	{0=1, 1=1, 2=1,3=1}

✅ Final Answer
count = 2
     */
}
