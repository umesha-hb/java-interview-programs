package com.uttara.string.infixtopostifix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ch02Sum {


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
