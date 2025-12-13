package com.uttara.luxoft.scb;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;


public class FindFristNonRepetableCharcterinString {

	public static void main(String[] args)
	{
		String str="streets";
		System.out.println(findFirstNonReapetableCharcterInString(str));
		

	}

	public static Optional<Entry<Character, Integer>> findFirstNonReapetableCharcterInString(String input)
	{
		Map<Character, Integer> hs = new LinkedHashMap<>();
		char ch[]=input.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
		
			if(hs.containsKey(ch[i]))
				hs.put(ch[i], hs.get(ch[i])+1);
			else
				hs.put(ch[i], 1);
		}
		hs.entrySet().forEach(System.out::println);
		return hs.entrySet().stream().filter(e->e.getValue()==1).findFirst();
	}

}
