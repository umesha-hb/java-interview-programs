package com.utttara.strings;

import java.util.Arrays;

public class LongestCommonContinousCharactersInGivenListOfStrings
{
	 public static void main(String args[]) {
		 String arr[] = {"gracefully", "graceful",
				 "disgraceful", "grace"};
		 System.out.println(longestCommonSubstring(arr));
	 }
	public static String longestCommonSubstring(String[] strs) {
		if (strs == null || strs.length == 0) return "";

		String prefix = strs[0]; // Start with first string

		for (int i = 1; i < strs.length; i++) {
			while (!strs[i].contains(prefix)) {
				// Remove last character from prefix until it matches
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		}
		return prefix;
	}

}
