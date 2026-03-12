package com.utttara.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestCommonContinousCharactersInGivenListOfStrings
{
	 public static void main(String args[]) {

		 String arr[] = {"abcxyz","xyzabc","yzabcx"};
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
					return "No LongestCommonContinousCharactersInGivenListOfStrings";
			}
		}
		return prefix;
	}

}
