package com.utttara.strings;

import java.util.Arrays;

public class LongestCommonContinousCharactersInGivenListOfStrings
{
	 public static void main(String args[])
	    {
	        String arr[] = { "gracefully", "graceful",
	                        "disgraceful","grace" };
	        int n = arr.length;
	        // Take first word from array as reference
	        String first  = arr[0];
	        int len = first .length();
	 
	        String longest = "";
	 
	        for (int i = 0; i < len; i++) 
	        {
	            for (int j = i + 1; j <= len; j++)
	            {
	                String substring  = first.substring(i, j);
					boolean existsInAll = Arrays.asList(arr).stream()
							.allMatch(s -> s.contains(substring));
					if (existsInAll && substring.length() > longest.length()) {
						longest = substring;
					}
	            }
	        }
	        System.out.println(longest);
    }
	 

}
