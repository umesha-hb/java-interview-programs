package com.uttara.longest.string;

import java.util.HashMap;
import java.util.Map.Entry;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class FindTheLongestString {
 
	public static void main(String[] args) 
	{
		/*
		 * Given a string s,
		 *  find the length of the longest substring without repeating
		 * characters. htte eeefgrrddd Output : 4
		 * 
		 */
		String str = "ddhtteeeefgrrddd";
//		System.out.println(str+":"+findLongestSubstring(str));
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++)
		{
					if(hashMap.containsKey(str.charAt(i)))
						hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
					else
						hashMap.put(str.charAt(i), 1);
		}
		System.out.println(hashMap);
		Entry<Character, Integer> max = hashMap.entrySet()
	            .stream()
	            .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
	            .get();
//	            .getKey();
		System.out.println(max);
		String s = "";
	 for (int i = 0; i < max.getValue(); i++) {
		s = s +max.getKey();
	}
		System.out.println(s); 

		
	}

}
