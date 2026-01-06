package com.uttara.twosum.infixtopostifix;

import java.util.HashMap;
import java.util.Map;

//Optimized – O(n) using HashMap

public class TwoSumOptimized {


	public static void main(String[] args)
	{
		int[] numbers = {2,7,11,15};
		int target = 9;
		Map<Integer, Integer> vistedNumbers = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++)
		{
			int delta = target - numbers[i];
			if(vistedNumbers.containsKey(delta))
			{
				System.out.println(vistedNumbers.get(delta)+" "+i);
			}
			else
			vistedNumbers.put(numbers[i], i); 
		}

	} 
}
